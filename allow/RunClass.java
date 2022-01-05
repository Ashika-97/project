package allow;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.InputMismatchException;
import java.util.Properties;
import java.util.Scanner;
import construct.CallConstructor;
import fileDirectory.FileDirectoryTask;
import fileProject.FileCreateTask;
import pojoPack.PojoClass;
import readProperty.ReadFilesText;
import singletonPack.SingletonClass;
import storeProperties.PropertiesTask;
public class RunClass {

	FileCreateTask run=new FileCreateTask();
	PropertiesTask task=new PropertiesTask();
	ReadFilesText read=new ReadFilesText();
	CallConstructor run1=new CallConstructor();
	FileDirectoryTask runner=new FileDirectoryTask();
	PojoClass pojo=new PojoClass();
	static Scanner scan=new Scanner(System.in);
	
	//1
	public void method1FileCreated() {
		
	try {
	System.out.println("enter a string");
	String nameFile=scan.nextLine();
	boolean nametext=run.fileCreationMethod(nameFile);
	if(nametext)
	{
	System.out.println("enter a number to loop input writer");
	int number=scan.nextInt();
	scan.nextLine();
	for(int i=0;i<number;i++)
	{
		System.out.println("enter the string lines");
	String writeInput=scan.nextLine();
	run.fileWriterMethod(nameFile,writeInput);
	}}
	else
	{
		System.out.println("file alraedy existed");
	}
}
	catch(InputMismatchException e)
	{
		System.out.println("error occured");
	}
	catch(Exception exception)
	{
		exception.printStackTrace();
	}
}
	//2
	public void methodFileWriterCreated(){
		try {
			
			Properties propInput=task.propertiesMethod();
			System.out.println("enter a number");
			int num=scan.nextInt();
			scan.nextLine();
			for(int i=0;i<num;i++) {
			System.out.println("enter a string key ");
			String keyName=scan.nextLine();
			System.out.println("enter a string value ");
			String valueName=scan.nextLine();
			task.setValues(propInput, keyName, valueName);}
			System.out.println("enter the file name");
			String fileName=scan.nextLine();
		    task.propertyWriteMethod(propInput,fileName);
		}
		catch(IOException e)
		{
			System.out.println("error occured");
		}
		catch(Exception exception)
		{
			System.out.println("error occured");
			exception.printStackTrace();
		}
	}
		
//3
	public void methodPropertyCreated() {
		try
		{
			System.out.println("enter th fileName");
			String name=scan.nextLine();
			Properties pro=task.propertiesMethod();
		    read.readerText(pro,name);	
		    if(pro!=null)
			{
		System.out.println("file exists");
		}
			else 
			{
				System.out.print("you entered a new file not old file");
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("error occured");
		}
		catch(Exception exception)
		{
			exception.printStackTrace();	
		}
}	
	//4
	public void directoryCreated()
	{
		try
		{
			/*System.out.println("enter a string");
			String nameFile=scan.nextLine();
			run.fileCreationMethod(nameFile);*/
		System.out.println("enter the number you want to create directory file");
		int num=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<num;i++) {
		System.out.println("enter a string");
		String pathFile=scan.nextLine();
	    runner.myDirectory(pathFile);
	    System.out.println("enter a file name");
	    String filePathDir=scan.nextLine();
	    runner.fileDirectPath(pathFile,filePathDir);
		}
		}
		catch(InputMismatchException e)
		{
			System.out.println("enter the number instead of string");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	//5
	public void classcallMethod() {
	  try {
		  System.out.println("enter the number");
		  int num=scan.nextInt();
		  scan.nextLine();
		  for(int i=0;i<num;i++) {
		  System.out.println("enter the string");
		  String strInput=scan.nextLine();
		  run1.CallConstructor1(strInput);
		  System.out.println(run1);}
	  }
	  catch(InputMismatchException e)
		{
			System.out.println("error occured");
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}
//6
	public void methodPojo()
    {
       try
        {
        System.out.println("enter a number");
        int num=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<num;i++)
        {
            System.out.println("enter a string name");
            String nameInput=scan.nextLine();
            pojo.setName(nameInput);
            System.out.println("enter a number");
            int numberInput=scan.nextInt();
            scan.nextLine();
            pojo.setid(numberInput);
            pojo.getName();
            pojo.getid();
            System.out.println(pojo);}
        }
      catch(InputMismatchException e)
		{
			System.out.println("error occured");
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}

//7
 public void valuePojo1()
    {
      try
          {
        System.out.println("enter a number");
        int num=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<num;i++)
        {
            System.out.println("enter a string name");
            String nameInput=scan.nextLine();
            pojo.setName(nameInput);
            System.out.println("enter a number");
            int numberInput=scan.nextInt();
            scan.nextLine();
            pojo.setid(numberInput);
           System.out.println(pojo.getName());
           System.out.println(pojo.getid());
           }
        }
	 catch(InputMismatchException e)
		{
			System.out.println("error occured");
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	
	
	}
	
//8
 public void reflectionMethod()
 {
	 try
	 {
		 System.out.println("enter");
		 Class<?> reflect=Class.forName("reflectionPack.ReflectionClass");
		 
		 System.out.println("calling default constructor");
		 Constructor<?> construct=reflect.getDeclaredConstructor();
		 Object newInstance=construct.newInstance();
		 System.out.println(newInstance);
		 
		 System.out.println("calling argument constructor");
		 Constructor<?> construct1=reflect.getDeclaredConstructor(String.class,int.class);
		 System.out.println("enter a string");
		 String nameInput=scan.nextLine();
		 
		 System.out.println("enter a number");
		 int numInput=scan.nextInt();
		 scan.nextLine();
		 Object paraType=construct1.newInstance(nameInput,numInput);
		 System.out.println(paraType);
		 
		 System.out.println("setter methods");
		 Method setMethodClass=reflect.getMethod("setName",String.class);
		 String numberIn=scan.nextLine();
		 //scan.nextLine();
		setMethodClass.invoke(paraType,numberIn);
		
		 System.out.println("getter methods");
		 Method getMethodClass=paraType.getClass().getMethod("getName");
		 String num=getMethodClass.invoke(paraType).toString();
		 System.out.println(num);
	 }
	 catch(InputMismatchException|NoSuchMethodException|ClassNotFoundException exception)
		{
		 exception.printStackTrace();
			System.out.println("error occured");
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
 }
 
 //9
/* public void enumMethod() 
 {
	 try
	 {      System.out.println("enter a number");
	        int number=scan.nextInt();
	        
	        
					//System.out.println(" the color code of " + object + " is " + values);
		}
	 catch(InputMismatchException e)
		{
			System.out.println("error occured");
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	
	 
//10
	 public void singleMethod()
	 {
		 try
		 {
			 SingletonClass ton=SingletonClass.getInstance();
			  ton.display();
		 }
			catch(Exception exception)
			{
				exception.printStackTrace();
			}
	 
 }*/	
 //10
	public void singleMethod()
	{
		try
	 {
		 SingletonClass ton=SingletonClass.getInstance();
		 ton.display();
		 System.out.println(ton.num);
		  System.out.println(ton.nameString);
	 }
		catch(Exception exception)
		{
			exception.printStackTrace();
		}

}
 
 
public static void main(String args[])
{
		RunClass obj=new RunClass();
		System.out.println("enter a number from 1 to 9");
		int num=scan.nextInt();
		scan.nextLine();
		
switch(num)
	{
	case 1:	obj.method1FileCreated();
		    break;
	
	case 2: obj.methodFileWriterCreated();
	        break;	    
		    
	case 3:obj.methodPropertyCreated();
	        break;
	case 4:obj.directoryCreated();
	        break;
	        
	case 5: obj.classcallMethod();
	        break;
	case 6:obj.methodPojo();
	        break;
	case 7:obj.valuePojo1();
	        break;
	case 8:obj.reflectionMethod();
	        break;
	case 9:obj.singleMethod();
	        break;
	
	}
  }
}