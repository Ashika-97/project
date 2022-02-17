package newBank;

import java.util.*;
import java.util.Map.Entry;

public class BankConnection {

		Map<Integer,CustomerInformation>  custom=new HashMap<>();
		Map<Integer,Map<Integer, AccountInfo>> finalMap=new HashMap<>();
	   
	    private  int id=0;
	    int initialAmount=1000;
	    boolean status;
		public int getAccId()
		{
			return ++id;
		}
		 
		private int customId=0;
		 
		 public int getCustomId()
			{
				return ++customId;
				
			}
		
		 
		public void addCustomerDetails(CustomerInformation customHash)
		{   
			
			custom.put(getCustomId(), customHash);
			
		}
		
		
	    public CustomerInformation getCustomerDetails(int customerId)
	    {
			return custom.get(customerId);
	    }
		
	   
	    
		public void addAccount(int customerId,AccountInfo account) throws Exception {
			
			
			Map<Integer, AccountInfo> record= finalMap.get(customerId);
				
			if(record==null)
			{
				record=new HashMap<Integer,AccountInfo>();
				finalMap.put(customerId,record);	
			}
			record.put(getAccId(), account);	 
		
		}
		
		public  Map<Integer, AccountInfo> getAccount(int customerId) {
		
			return finalMap.get(customerId);
		}
		
		
		public  AccountInfo getAccIdOnly(int cusId,int accId) throws Exception
		{      
			 
		    
			  
		      Map<Integer,AccountInfo> account= finalMap.get(cusId);
			  if(account!=null)
			   {
			      return  account.get(accId);
			  }
			
			
			return null;
		
		}
		
		public void depositMoney(int accId,long number,AccountInfo account) throws Exception
		{   
		 
			Map<Integer,AccountInfo> input=finalMap.get(accId);
				
			  if(input!=null)
			    {
			
				AccountInfo account_1=input.get(accId);
			    long balance=account_1.getBalance();
			    
				balance+= number;
				account_1.setBalance(balance);
				
			    input.put(getAccId(), account);
			    
			  }
			
			finalMap.put(accId, input);
		}
		
		public Map<Integer, AccountInfo> getDepositMoney(int accId)
		{
			return finalMap.get(accId);
		}
		

		public void amountWithdrawal(int accId,long number,AccountInfo account) throws Exception
		{  
			
			Map<Integer,AccountInfo> input=finalMap.get(accId);
			if(input!=null) {
				AccountInfo info=input.get(accId);
				if(info!=null) {
			    long amount=info.getBalance();
			  if(amount>initialAmount)
			   {
			  amount-=number;
			  info.setBalance(amount);
			  input.put(getAccId(), account);
			}
			
			finalMap.put(accId,input);
			}
		}
			}
		
		 public AccountInfo getAccountInfo(Map<Integer,AccountInfo> mapInput,int accountId)
		    {  
		    	return mapInput.get(accountId);
		    }
		 
		public Map<Integer, AccountInfo> getWithdrawal(int accId1)
		{
			return finalMap.get(accId1);
		}
		 
	    public void changeStatusCustomer(int customerId,int status) throws Exception
	    {
	 	   CustomerInformation customer=getCustomerDetails(customerId);
	 	   
	 	   if(customer!=null)
	 	   {	   
	 	   
	 	       if(status==1)
	 	        {
	 	             customer.setStatus(true);
	 	        }
	 	        else 
	 	        {
	 		          customer.setStatus(false);
	 	        }
	 	   }
	 	   
	    }
	    
	    public void changeStatusAccount(int customerId,int accountId,int status) throws Exception
	    {      
	    	 
	    	   Map<Integer,AccountInfo> accountInfo=getAccount(customerId);
	    	  
	    
	    	   AccountInfo account =getAccountInfo(accountInfo, accountId);
	    	   
	    	   if(account!=null)
	    	   {	   
	    	   
	    	       if(status==1)
	    	       {
	    	          account.setStatus(true);
	    	       }
	    	       else 
	    	       {
	    		       account.setStatus(false);
	    	       }
	    	   }
	    }
	    
		
		  public List<AccountInfo> getActiveAccountList(int id)
	      {
	   	   Map<Integer,AccountInfo> account=getAccount(id);
	   	   
	   	   if(account!=null)
	   	   {
	   	         List<AccountInfo> listAccount=new ArrayList<>();
	   	   
	   	         for(Entry<Integer, AccountInfo> entry:account.entrySet())
	   	         {
	   		          AccountInfo record=entry.getValue();
	   		          
	   		          if(record.getStatus())
	   		          {
	   			          listAccount.add(record);
	   		           }
	   	         }
			        return listAccount;   
	   	   }
	   	   
	   	      return null;
	      }
	     	
	}


