package BankDbLayer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class CustomerDb{

  
public void creationCustomer()
	{
		
			String query=("CREATE TABLE IF NOT EXISTS CustomerDetails(CustomerId bigint Not Null AUTO_INCREMENT ,"
					+ "CustomerName varchar(25) Not Null,"
					+ "Address varchar(255) Not Null,"
					+ "MobileNumber BigInt,"
					+ " PRIMARY KEY (CustomerId));");
			
			LogicalConnection.creationTable(query);}


public  void insertionCustomer(CustomerInformation custom) throws Exception
	{ 


	String insert="INSERT INTO CustomerDetails(CustomerName,MobileNumber,Address) VALUES (?,?,?);";
	try ( PreparedStatement post=LogicalConnection.getConnection().prepareStatement(insert))
		 {
		String name=custom.getCustomerName();
		post.setString(1, name);
		long mobNo=custom.getMobileNumber();
		post.setLong(2, mobNo);
		String address=custom.getAddress();
		post.setString(3,address);
		post.executeUpdate();	
		System.out.println("insertion Of Customer exceuted successfully ");
		
		 }
	catch(Exception e)
		 {
		     e.printStackTrace();
			 System.out.println("Exception occurs in customer dblayer customer insertion");
	}
 }
	
public  Map<Integer,CustomerInformation> selectionCustomer() throws Exception
	{
		 Map<Integer,CustomerInformation>  map=new HashMap<>();
		 
		 String query="SELECT * From CustomerDetails";
		    try(PreparedStatement statement=LogicalConnection.getConnection().prepareStatement(query);
		    		ResultSet result=statement.executeQuery();)
		       {
		    	while(result.next())
		    	  {  
		    	   CustomerInformation pojo=new CustomerInformation();
		    	   int number1=result.getInt("customerId");
		    	   pojo.setCustomerName(result.getString("customerName"));
		    	   pojo.setAddress(result.getString("address"));
		    	   map.put(number1, pojo); 
		    	  }
		    	System.out.println("selection executed in customer db layer succcessfully! ");
		    }
		  
		    catch(Exception e)
		   	 {
		   		 System.out.println("Exception occurs in customer dblayer Selection " + e.getMessage());
		    }
			return map;
	}
         
public  void updateCustomer(CustomerInformation custom) throws Exception
	{

	
	 String updated="Update CustomerDetails  Set customerName=? where customerId=?";
		try(PreparedStatement create=LogicalConnection.getConnection().prepareStatement(updated);)
		{
			String name=custom.getCustomerName();
			create.setString(1, name);
			int id1=custom.getCustomerId();
			create.setInt(2, id1);
			create.executeUpdate();
			System.out.println("updation successfully in customer db layer!");
		}
		 catch(Exception e)
	   	 {
	   		 System.out.println("Exception occurs in customer dblayer update layer ");
	    }
		
	}
}













