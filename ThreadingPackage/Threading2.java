package ThreadingPackage;

public class Threading2 implements Runnable {
	public void run()
	{
		System.out.println("Thread is activated");
	}
	
	public static void main(String args[])
	{
		Threading2 ts1 = new Threading2();
		Thread th1 = new Thread(ts1);
		th1.start();
	}

}
