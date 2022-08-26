package July_20;

public class Multi_Thread extends Thread {
	public void run()
	{
		try
		{
			System.out.println("Thread"+Thread.currentThread().getId()+" is running");
		}
		catch(Exception e)
		{
			System.out.println("Exception is caught");
		}
	}

	public static void main(String[] args)
	{
		int n=8;
		for(int i=0;i<n;i++)
		{
			Multi_Thread obj= new Multi_Thread();
			obj.start();
		}
	}

}
