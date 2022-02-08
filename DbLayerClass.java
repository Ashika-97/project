package newDbupdated;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DbLayerClass {
   // LogicConnection.CONNECTION.closeConnection();
      
	public enum LogicConnection {
	    
	    CONNECTION;
		 
		    private String url="jdbc:mysql://localhost/mydb";
		     private String username="root";
		     private String password="Root@123";
		     
		     public void closeConnection() 
		     {
		    	 if(conn!=null) {
		    		 try {
						conn.close();
					} 
		    		 catch (SQLException e) {}
		    	 }
		     }
		  
		    private  Connection conn=null;
			
		public Connection getConnection()
		{
			if(conn==null) {
				try {

					conn=DriverManager.getConnection(url,username,password);
				}
				catch(Exception ex)
				{
					return null;
				}
			}
		
				return conn;
		
			
		}	
	}

//start
public void  isEmptyCheck(String myStrings) throws Exception{
		if(myStrings==null||myStrings.isEmpty())
		{
		throw new Exception("the given string is empty or null");
		}
		}

	
public void creationOfTable()  
	{
	String query=("CREATE TABLE IF NOT EXISTS ClassList(id int Not Null AUTO_INCREMENT ,Firstname varchar(255) Not Null,cityname varchar(255) Not Null,Rollnumber long,PRIMARY KEY (id));");
						
	          try(PreparedStatement create= LogicConnection.CONNECTION.getConnection().prepareStatement(query);)
	          {
		       create.executeUpdate();	
		       System.out.println("Table creation First stage complete ");
             } catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
			
   
	//3
public  int insertionOfTable(String fname,String cityname,long rollno) throws Exception
	{ 
	isEmptyCheck(fname);
	isEmptyCheck(cityname);
    int count=0;
    String insert=MessageFormat.format("INSERT INTO ClassList(Firstname,cityname,Rollnumber) VALUES (\''{0}\'',\''{1}\'',\''{2}\'');",fname,cityname,rollno);
    try ( PreparedStatement post=LogicConnection.CONNECTION.getConnection().prepareStatement(insert))
		 {
		count=post.executeUpdate();		
		 }
    catch(Exception e)
  	 {
  		 System.out.println("Exception occurs in dblayer drop");
   }
		   
		   return count;
		  
 }
	 //4
public  Map<Integer,SelectionPojo > selectionOfTable() throws Exception
	   {
		 Map<Integer,SelectionPojo>  map=new HashMap<>();
		 
		 String query="SELECT * From ClassList";
		    try(PreparedStatement statement=LogicConnection.CONNECTION.getConnection().prepareStatement(query);ResultSet result=statement.executeQuery();)
		    {
		    	while(result.next())
		    	{  
		    	   SelectionPojo pojo=new SelectionPojo();
		    	   int number1=result.getInt("id");
	               pojo.setFirstName(result.getString("firstname"));
		    	   pojo.setCityinput(result.getString("cityname"));
		    	   pojo.setRollId(result.getLong("Rollnumber")); 
		    	  
		    	  
		    	   map.put(number1, pojo);
		    	  
		    	}
		    	
		   
		    }
		  
		    catch(Exception e)
		   	 {
		   		 System.out.println("Exception occurs in dblayer Selection " + e.getMessage());
		    }
			return map;
		  
		   

	   }
//5
public  int updateOfTable(String name,int id1) throws Exception
		{
	isEmptyCheck(name);
		 int count=0;
		 String updated="Update ClassList  Set firstname=? where id=?";
			try(PreparedStatement create=LogicConnection.CONNECTION.getConnection().prepareStatement(updated);)
			{
				create.setString(1, name);
				create.setInt(2, id1);
			
				count=create.executeUpdate();
			}
			 catch(Exception e)
		   	 {
		   		 System.out.println("Exception occurs in dblayer drop ");
		    }
			return count;
		}
	 //6
public  int deleteTable(long num) throws Exception
		{
			int num1=0;
			String delete="DELETE FROM ClassList where id=?";
			try(PreparedStatement state=LogicConnection.CONNECTION.getConnection().prepareStatement(delete);) 
			{  
				state.setLong(1, num);
				num1=state.executeUpdate();				
			}
			 catch(Exception e)
		   	 {
		   		 System.out.println("Exception occurs in dblayer drop");
		    }
			return num1;
		}
	 
//7
public  void dropOfTable() throws Exception
    {
		 
		 String input="DROP TABLE ClassList";
   	 try(  PreparedStatement state=LogicConnection.CONNECTION.getConnection().prepareStatement(input);)
   	 {  
   		state.executeUpdate();
   		System.out.println("drop statement executed"); 
   	 }
   	 catch(Exception e)
   	 {
   		 System.out.println("Exception occurs in dblayer drop");
    }

}
public void closeCall() 
{
    LogicConnection.CONNECTION.closeConnection();

}
}
//update
//System.out.println(i+" elemnts updated");

/*String query="SELECT firstname,cityname FROM ClassList";
ResultSet result=stt.executeQuery(query);
while(result.next()){
   System.out.print("ID: " + result.getInt("id"));
      System.out.print(", Firstname is: " + result.getString("firstname"));
   System.out.println(",cityname: " + result.getString("cityname"));
}*/

 //result.close();
//stt.close();

/*public Connection getConnection() throws Exception 
{ 
	 
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/mydb";
		String username="root";
		String password="Root@123";
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("connected");
		return con;
	    }
	catch(Exception ex)
	{
		throw new Exception("Exception occurs in connection");
	}
	
}*/
