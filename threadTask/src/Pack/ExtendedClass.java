package Pack;

public class ExtendedClass extends Thread
{
public void run()
{
	/*System.out.println("the run class thread" +Thread.currentThread().getName());
	System.out.println("the run class thread priority" +Thread.currentThread().getPriority());
	System.out.println(" the run class thread state " + Thread.currentThread().getState());*/
	System.out.println("going to sleep "+ Thread.currentThread().getName());
	try {
		Thread.sleep(3000);
	}
	catch(Exception exception)
	{
		exception.printStackTrace();
	}
	System.out.println("After sleep "+ Thread.currentThread().getName());
}
			
	
}
