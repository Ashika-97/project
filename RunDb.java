package newDbPack;
import java.util.*;

import newDbupdated.SelectionPojo;


public class RunDb {
	static Scanner scan =new Scanner(System.in);
    static TaskLogic task=new TaskLogic();
    
	
	public  void insertionUpdate()
	{
		 int num1=0;
		try {
	
	       System.out.println("Enter no of rows to insert:");
		   int num=scan.nextInt();
		   scan.nextLine();
		   for(int i=0;i<num;i++)
		     {
	            System.out.println("enter details of student "+(i+1));
	            System.out.println("Enter FirstName:");
		        String inpName=scan.nextLine();
		        System.out.println("Enter CityName:");
		        String lastName=scan.nextLine();
		        System.out.println("Enter Roll Number:");
		    long rollNo=scan.nextLong();
		    scan.nextLine();
		    System.out.println(num1+ "rows Affected");
		    num1=task.insertionUpdated(inpName, lastName,rollNo);
	          }
		   
		   System.out.println("inserting succesfully");
           }
		   catch(Exception e)
		   {
			   System.out.println("Exception occurs in insertion method in main "+e.getMessage() );
		   }
	
	}
	public void selectionUpdate()
	{ 
		try
		{
	    Map<Integer, SelectionPojo > hash=task.selectionUpdate();
		System.out.println(hash);
		System.out.println("selected requirements are shown");
		}
		catch(Exception e)
		{
			System.out.println("exception in main Selection update"+e.getMessage());
		}
		
	}

	public void updateMethodOfMain()
	{
		try {
			System.out.println("Enter a name to update");
			String input=scan.nextLine();
			System.out.println("Enter a number id in update");
			int num=scan.nextInt();
			int rowsAf=task.updateUpdation(input, num);
			System.out.println(rowsAf+" rows affected!");
			System.out.println("update method executed in main");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception occurs in main update method "+e.getMessage());
		}
	}
	public void deleteUpdationMethod()
	{
		try {
			System.out.println("Enter a rollno to delete ");
			long rollno=scan.nextInt();
			int num=task.deleteUpdate(rollno);
			System.out.println(num);
			System.out.println("delete executed");
		}
		catch(Exception e)
		{
			System.out.println("Exception occurs in main deletion "+ e.getMessage());
		}
	}
		
	public static void main(String[] args) {
		      
	       RunDb object=new RunDb();
           System.out.println("Enter a number to get the database table");
           int number=scan.nextInt();
           scan.nextLine();
           boolean initial=true;
           while(initial)
           {
		      switch(number)
		      {
		  
		        case 1:task.createUpdated();
		        
		        case 2:object.insertionUpdate();
		        
		        case 3:object.selectionUpdate();

		        case 4:object.updateMethodOfMain();
		        
		        case 5:object.deleteUpdationMethod();
		        
		        case 6:task.dropUpdated();
		
		        case 7:task.call();
		          
		        case 8:initial=!true;
	}
           }
	
	}
            
}
/* try {
Connection con=LogicConnection.CONNECTION.getConnection();
}
catch(Exception ex)
{
	 System.out.println("the exception in main"+ ex.getMessage());

}*/
/*select
 * System.out.println("enter a number to put how many selections you want ? ");

int num=scan.nextInt();
scan.nextLine();
for(int i=0;i<num;i++)
{
System.out.println("enter an Firstname");
String input=scan.nextLine();
System.out.println("enter a cityname to select");
String cityinput=scan.nextLine();
System.out.println("enter a integer");
int num1=scan.nextInt();*/