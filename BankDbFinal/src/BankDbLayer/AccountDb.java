package BankDbLayer;
import java.sql.*;
import java.util.*;

public class AccountDb {
         
	
public void creationAccount()
		{

				String query=("CREATE TABLE IF NOT EXISTS AccountDetails("
						+ "accountId bigint Not Null AUTO_INCREMENT ,"
						+ "customerId bigint,"
						+ "branch varchar(100) Not Null,"
						+ "balance Double,"
						+ "status Boolean,"
						+ "PRIMARY KEY (accountId),"
						+ "FOREIGN KEY(customerId) REFERENCES CustomerDetails(customerId));");
									
				LogicalConnection.creationTable(query);
		}

public  void insertionAccount(AccountInformation acc1) throws Exception
	{
	
	            String insert=("INSERT INTO AccountDetails(branch,balance,status,customerId) VALUES (?,?,?,?);");
	            try ( PreparedStatement post=LogicalConnection.getConnection().prepareStatement(insert))
		           	 {
	    	                String branch=acc1.getBranch();
	                    	post.setString(1, branch);
	                     	double balance=acc1.getBalance();
	                     	post.setDouble(2,balance);
	                      	post.setBoolean(3, true);
	                    	int cusId=acc1.getCustomerId();
	                     	post.setInt(4, cusId);
		                  	post.executeUpdate();		
		                	System.out.println("Inserting successfully in Account inserting layer! ");
			          }
	               catch(Exception e)
	  	            {
	                   	e.printStackTrace();
	  		            System.out.println("Exception occurs in Account dblayer insertion");
	                }
			   		  
	 }
		
public  Map<Integer,Map<Integer,AccountInformation >> AllAccounts() throws Exception
    {
			        Map<Integer, AccountInformation>  map=new HashMap<>();
			        Map<Integer,Map<Integer,AccountInformation>> finalMap=new HashMap<>();
			      
			        String query="SELECT * From AccountDetails";
			        try(PreparedStatement statement=LogicalConnection.getConnection().prepareStatement(query);
			    		   ResultSet result=statement.executeQuery();)
			            {
			               	while(result.next())
			    	           {  
			               	       AccountInformation pojo=new AccountInformation();
			    	               int number1=result.getInt("accountId");
			    	               pojo.setAccountId(result.getInt("accountId"));
			    	               pojo.setCustomerId(result.getInt("customerId"));
			    	               pojo.setBalance(result.getDouble("balance"));
			    	               pojo.setBranch(result.getString("branch"));
			    	               System.out.println(result.getBoolean("status"));
			    	               pojo.setStatus(result.getBoolean("status"));
			    	               map.put(number1, pojo);
			    	               System.out.println(map);
			       	               finalMap.put(result.getInt("customerId"), map);
			       	            System.out.println("Selection");
			    	           
			    	           }
			    	
			                      
			           }
		
			        catch(Exception e)
			   	        {
			    	        System.out.println("Exception occurs in dblayer Selection " + e.getMessage());
			            }
			  	  System.out.println(finalMap);
				return finalMap;	
	}
  
public void changeStatusAccount(int accId,int cusId,int statusnumber)
         {   
	           boolean bool;
	           
	           if(statusnumber==1)
	           {
	        	   bool=true;
	           }
	           else {
	        	   bool=false;
	           }
	                String update="Update AccountDetails Set Status=? Where AccountId=?";
	                try(PreparedStatement state=LogicalConnection.getConnection().prepareStatement(update))
	        	           {
	        	        	   state.setBoolean(1, bool);
	        	        	   state.setInt(2,accId);
	        	        	   state.executeUpdate();
	        	           }
                     
		              
                  
	          catch(Exception e)
	             {
	        	     e.printStackTrace();
	            	 System.out.println("Exception in status changing in Account Db "+ e.getMessage());
	             }
         
         }
  
public Map<Integer,AccountInformation>  activeAccountList(boolean status) throws SQLException
       {
	
	           String query="Select accountId,balance,branch,status From AccountDetails Where status=? ";
               
               Map<Integer,AccountInformation> resultMap=new HashMap<>();
             
              
	           try(PreparedStatement state=LogicalConnection.getConnection().prepareStatement(query);)
	             {
		           state.setBoolean(1,status);
		           try(ResultSet result=state.executeQuery();)
		              {
		               while(result.next())
		                 {
		            	   AccountInformation acc= new AccountInformation();
		            	  int num1=result.getInt("accountId");
		            	  acc.setAccountId(num1);
		            	  acc.setBalance(result.getDouble("balance"));
		            	  acc.setStatus(status);
		            	  acc.setBranch(result.getString("branch"));
		            	  resultMap.put(acc.getAccountId(), acc);
		            	          	   
		                  }
		             }
		
		
		catch(Exception e)
		{
			System.out.println("Exception in activeAccount list "+ e.getMessage());
		}
		System.out.println("Active Account Exceuted!");
	}
	catch(Exception e)
	{
		System.out.println("Exception in activeAccount list "+ e.getMessage());
	}
	return resultMap;
}
    

		
public void amountdeposit(AccountInformation acc) throws Exception
        
   {
	   
	String query="Select balance from AccountDetails where accountId=?";
	
	try(PreparedStatement state=LogicalConnection.getConnection().prepareStatement(query);)
	{  
		int acc1=acc.getAccountId();
		state.setInt(1,acc1);
		ResultSet result=state.executeQuery();
		double balanceAmount=0;
		if(acc1!=0)
		  {
		   while(result.next())
		     {
			  
			balanceAmount=result.getDouble("balance");
			balanceAmount+=acc.getBalance();
			
		     }
			String modify="update AccountDetails set balance=? where accountId=?";
			try(PreparedStatement create=LogicalConnection.getConnection().prepareStatement(modify);)
			{
			
				create.setDouble(1, balanceAmount);
				create.setInt(2, acc1);
				create.executeUpdate();
				
			}
		}
		System.out.println("Amount deposited successfully!");	
	}
		
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception in amountDeposit layer in AccountDb");}
	}
			
			
			
			
public void amountWithdrawalAccount(int accId,double balance) throws Exception
	{
		
		int initialAmount=500;
		String query="Select accountId,balance,customerId From AccountDetails where accountId=?";	
		try(PreparedStatement state=LogicalConnection.getConnection().prepareStatement(query);)
		{
			
			state.setInt(1,accId);
			try(ResultSet result=state.executeQuery();)
			{
		    	while(result.next())
			      {
		    		double balanceAmount=0;
		    	
		    		if(balance<initialAmount) 
		    		{
				    balanceAmount=result.getDouble("balance");
				    System.out.println("before balance:"+balanceAmount);
				    balanceAmount=balanceAmount-balance;
				     }
		    		System.out.println("after balance:"+balanceAmount);
		               String update=("Update AccountDetails Set balance=? Where accountId=?;");
		               
		               try(PreparedStatement post=LogicalConnection.getConnection().prepareStatement(update))
				           {
		    	             post.setDouble(1,balanceAmount);
		    	             post.setInt(2,accId);
				             post.executeUpdate();
				             post.executeUpdate();	
				             System.out.println("the balance is "+ balanceAmount);
				             System.out.println("Amount withdrawn successfully ");
				           }
			      }
		}}
			catch(Exception e)
			  {
			       	e.printStackTrace();
				    System.out.println("Exception in amountwithdrawal layer in AccountDb");
			   }
		
		}
		
	
public  void updateAccount(AccountInformation account) throws Exception
  {
          int count=0;
          String updated="Update AccountDetails  Set branch=? where accountId=? and customerId=?";
	      try(PreparedStatement create=LogicalConnection.getConnection().prepareStatement(updated);)
	         {
	    	  String branchName=account.getBranch();
		      create.setString(1, branchName);
		      int accId=account.getAccountId();
		      create.setInt(2, accId);
		      int cusId=account.getCustomerId();
		      create.setInt(3, cusId);
	
		    count=create.executeUpdate();
		    System.out.println(" updation successfully ");
	         }
	       catch(Exception e)
   	        {
	    	   e.printStackTrace();
   		       System.out.println("Exception occurs in dblayer drop ");
                    }
	        System.out.println("the update count is "+ count);
	        
}


public  void deletionAccount(AccountInformation account1) throws Exception
{
	
	String delete="DELETE FROM AccountDetails where accountId=? or customerId=?";
	try(PreparedStatement state=LogicalConnection.getConnection().prepareStatement(delete);) 
	{  
		state.setInt(1, account1.getAccountId());
		state.setInt(2,account1.getCustomerId());
		state.executeUpdate();	
		System.out.println("deleted successfully");
	}
	 catch(Exception e)
   	 {
   		 System.out.println("Exception occurs in dblayer delete");
    }
	
}

public  void dropAccountTable() throws Exception
  {
		 
     String input="DROP TABLE AccountDetails";
 	 try(Statement state=LogicalConnection.getConnection().createStatement();)
 	 {  
 		state.executeUpdate(input);
 		System.out.println("drop statement executed"); 
 	 }
 	 catch(Exception e)
 	 {
 		 System.out.println("Exception occurs in dblayer drop");
  }

}

public void closeCall() 
{
	LogicalConnection.closeConnection();

}

}

		
		
			
			















// Map<Integer, AccountInformation>  map=finalMap.get(accId);
//if(map!=null) {
//boolean bool=status==1?true:false;
//state.executeUpdate();
//AccountInformation pojo=new AccountInformation();
// pojo.setStatus(result.getBoolean(bool));
//System.out.println("result:"+result.next());