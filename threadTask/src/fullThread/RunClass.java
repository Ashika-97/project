package fullThread;

public class RunClass implements Runnable{


	public void run() {
		
		/*System.out.println("the run of implements " +Thread.currentThread().getName());
		System.out.println("the run class implements " + Thread.currentThread().getPriority());
		System.out.println("the run class state " + Thread.currentThread().getState());*/
		System.out.println("going to sleep "+ Thread.currentThread().getName());
		try
		{
			Thread.sleep(10000);
		}
	
		catch(Exception exception)
		{
		exception.printStackTrace();
		}
	System.out.println("After sleep "+ Thread.currentThread().getName());
	}

}
