package dbmsTable;
import java.util.*;
import java.sql.*;
import java.text.MessageFormat;

public class TestTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	try {
	//		creationOfTable();
			insertionOfTable();
			selectionOfTable();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   	
	    }
		
	   public static void selectionOfTable() throws Exception
	   {
		  // ArrayList<String> list=new ArrayList<String>();
		    try {
		    	Connection con=getConnection();
		    	String l="SELECT cityname,Firstname FROM ClassList";
		    	Statement statement=con.createStatement();
		    	
		    	ResultSet result=statement.executeQuery(l);
		    	
		    	while(result.next())
		    	{
	                String name=result.getString(2);
		    		String city=result.getString(1);
		    		System.out.println( "the name and city is "+ name +"and "+city );
		    	}
		    	System.out.println("selected requirements are shown");
		    	
		    	con.close();
		    }
	   
	   
		    catch(Exception e)
		    {
		    	System.out.println("error in selection" + e.getMessage());
		    }
	   
		    finally {
				   System.out.println("selection completed");
			   }
	   
	  
	   }
	
	
	
	
	
	
	   public static void insertionOfTable() throws Exception
	   {
		   
		   try {
			   Scanner sn=new Scanner(System.in);
			   Connection con=getConnection();
			   Statement post=con.createStatement();
			   System.out.println("Enter no of rows to insert:");
			   int num=sn.nextInt();
			   sn.nextLine();
			   
			   for(int i=0;i<num;i++)
			   {
				   System.out.println("enter details of student "+(i+1));
				   System.out.println("Enter FirstName:");
			    String fName=sn.nextLine();
			    System.out.println("Enter CityName:");
			    String lName=sn.nextLine();
			    System.out.println("Enter Roll Number:");
			    long rollNo=sn.nextLong();
			    
		    String insert=MessageFormat.format("INSERT INTO ClassList(Firstname,cityname,Rollnumber) VALUES (\''{0}\'',\''{1}\'',\''{2}\'');",fName,lName,rollNo);
			    

				post.executeUpdate(insert);
			   }
		
			   		
			   con.close();
		   }
		   catch(Exception e)
		   {
			   System.out.println("error "+e.getMessage());
		   }
		   finally {
			   System.out.println("insertion completed");
		   }
	   }
		
	    public static void creationOfTable() throws Exception
	    {
	    	try {
	    		Connection con=getConnection();
	    		String q=("CREATE TABLE IF NOT EXISTS ClassList(id int Not Null AUTO_INCREMENT ,Firstname varchar(255) Not Null,cityname varchar(255) Not Null,Rollnumber long,PRIMARY KEY (id));");
	    		Statement create= con.createStatement();
	    		int count;
	    		count=create.executeUpdate(q);
	    		System.out.println("Table created!");
	    		con.close();
	    	}
	    	
	    	catch(Exception e)
	    	{
	    		System.out.println("Exception" + e.getMessage());
	    	}
	    	finally
	    	{
	    		System.out.println("Table creation First stage cmplete");
	    	}
	    	
	    }
	    
		public static Connection getConnection() throws Exception 
		{ 
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost/mydb";
				String username="root";
				String password="ashi1997@A";
				
				Connection con=DriverManager.getConnection(url,username,password);
				System.out.println("connected");
				return con;
			}
			catch(Exception ex)
			{
				System.out.println( "errror is in connection " +ex.getMessage());
			}
			
			
			return null;
			
		}
		
}
