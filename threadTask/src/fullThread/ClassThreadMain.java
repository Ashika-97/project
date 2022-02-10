package fullThread;
import java.io.*;
import java.util.*;
import fileHandling.CustomException;
import Pack.ExtendedClass;

public class ClassThreadMain {
	
	static Scanner scan=new Scanner(System.in);
    ExtendedClass extend=new ExtendedClass();
    RunClass object=new RunClass();
    
	
	
	public void getThreadDetails()
	{
		try
		{
		Thread thread=new Thread(extend);
		System.out.println("the main class before start" +thread.currentThread().getName());
		System.out.println("the main class priority before start" + thread.getPriority());
		System.out.println("the main class state before start" + thread.getState());
		thread.start();
		System.out.println("the main class after start" + thread.currentThread().getName());
		System.out.println( "the main class priority after start" + thread.getPriority());
		System.out.println("the main class after start ito get state " +thread.getState());
		
	}
	catch(Exception exception)
		{
		exception.printStackTrace();
		System.out.println("exception occurs");
		}
	}
	
public void runnableMethod()
{
	try
	{
		Thread able=new Thread(object);
		System.out.println("the main " + able.currentThread().getName());
		System.out.println("the main class " + able.getPriority());
		System.out.println("the main class " + able.getState());
		able.start();
		System.out.println("the main after start" + able.currentThread().getName());
		System.out.println("the main classafter start " + able.getPriority());
		System.out.println("the main class after start" + able.getState());
		
	}
catch(Exception exception)
	{
	exception.printStackTrace();
	System.out.println("the exception throws occur");
	}
}
	public void extendedMethodOfThread()
	{try
	{
		Thread t1=new Thread(extend);
		System.out.println("the input string");
		String inputString=scan.nextLine();
		t1.setName(inputString);
		Thread t2=new Thread(object);
		System.out.println("the input string");
		String nameInput=scan.nextLine();
		t2.setName(nameInput);
		System.out.println("the main class name " + t1.currentThread().getName());
		System.out.println("the main class prioirty " + t1.getPriority());
		System.out.println("the main class state " + t1.getState());
		System.out.println("the main class name " + t2.currentThread().getName());
		System.out.println("the main class prioirty " + t2.getPriority());
		System.out.println("the main class state " + t2.getState());
		t1.start();
		System.out.println(t1);
		System.out.println("the main class name after start " + t1.currentThread().getName());
		System.out.println("the main class prioirty after start " + t1.getPriority());
		System.out.println("the main class state after start " + t1.getState());
		t2.start();
		System.out.println(t2);
		System.out.println("the main class name after start " + t2.currentThread().getName());
		System.out.println("the main class prioirty after start " + t2.getPriority());
		System.out.println("the main class state after start " + t2.getState());
	}
	
	
	catch(Exception exception)
	{
		System.out.println("the exception presents");
		exception.printStackTrace();
	}
	
	}
public void sleepMethod()
{
	try {
		System.out.println("enter a number to loop ");
		int num=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<num;i++) 
		{
		Thread thread1=new Thread();
		System.out.println("enter a string");
		String stringName=scan.nextLine();
		thread1.setName(stringName);
		System.out.println("for observe Extended thread Name " + thread1.getName());
		}
	
		for(int j=0;j<num;j++) 
		{
		Thread thread2=new Thread(object);
		System.out.println("enter a string");
		String stringName1=scan.nextLine();
		thread2.setName(stringName1);
		System.out.println("for observe  Run thread name "+ thread2.getName());
		}
	}
	catch(Exception exception)
	{
		System.out.println("the exception presents");
		exception.printStackTrace();
	}
}

public void customSleep()
{
	try {
		System.out.println("enter a number to loop ");
		int number=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<number;i++) {
		Thread thread3=new Thread();
		System.out.println("Going to sleep " + thread3.currentThread().getName());
		System.out.println("enter a long number to sleep");
		long numberInput=scan.nextInt();
		thread3.sleep(numberInput);
		System.out.println("After sleep "+ thread3.currentThread().getName());	}
	}
	catch(InterruptedException exception)
	{
		System.out.println("exception occurs");
		exception.printStackTrace();
	}
}
	
	
	
	
	
	
	
	
	
public static void main(String[] args)	
{
	ClassThreadMain run=new ClassThreadMain();
	System.out.println("enter a number from 1 to 7 ");
	int num=scan.nextInt();
	scan.nextLine();
	
	
switch(num)
{
case 1: run.getThreadDetails();
        break;
case 2:run.runnableMethod();
        break;
case 3:run.extendedMethodOfThread();
        break;
case 4:run.sleepMethod();
        break;
case 5:run.customSleep();
        break;
















}
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
