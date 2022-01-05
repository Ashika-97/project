package singletonPack;

import javax.management.RuntimeErrorException;

public class SingletonClass {
	
 private static SingletonClass single;
 
 public String nameString;
 public String num;
 
 private SingletonClass()
 {
	 nameString="singleton class is processed"; 
 }
 
 public void display()
 {
		num= "singleton class is displayed";
 }
 
 public static SingletonClass getInstance() throws RuntimeErrorException
 {
	 try
	 {
	 if(single==null)
	 {
	synchronized(SingletonClass.class) {
	  if(single==null)
	 {
		 single=new SingletonClass();
		 System.out.println("instance is created");
	 }
	 else
	 {
		 System.out.println("the singleton instance is not null");
	 }
  }}}
	 catch(RuntimeErrorException exception)
	 {
		exception.printStackTrace();
	 }
	 return single;
  }
}
//bullpugh implementation
/*public class LoggerSingleton{
 * public String string;
	private LoggerSingleton()
	{
	string="constructor class is displayed";
	}
	private static class LoggerHelper{
		
	private static final LoggerSingleton single=new LoggerSingleton();
	
}
public static LoggerSingleton getInstance()
{
try{
if(!single=null){
System.out.println("the object is already present");}
else
{
System.out.println("the object is null");
}
	
}
	catch(RuntimeErrorException exception)
	 {
		exception.printStackTrace();
	 }
	 return LoggerHelper.single;
}}*/

 