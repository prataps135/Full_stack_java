package ThreadingPackage;


public class Threading extends Thread {
	
	public void run()
	{
		System.out.println("Thread is activated");
	}
	public static void main(String args[]) {
		Threading ts1 = new Threading();
		ts1.start();
		
	}
}
