package ThreadingPackage;

public class MultiThreadPriorityex1 extends Thread{
	public void run()
	{
		System.out.println("Activated thread name "+ Thread.currentThread().getName());
		System.out.println("Activated thread priority: "+ Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		MultiThreadPriorityex1 mtp1 = new MultiThreadPriorityex1();
		MultiThreadPriorityex1 mtp2 = new MultiThreadPriorityex1();
		mtp1.setPriority(Thread.MIN_PRIORITY);
		mtp2.setPriority(Thread.MAX_PRIORITY);
		mtp1.start();
		mtp2.start();
	}

}
