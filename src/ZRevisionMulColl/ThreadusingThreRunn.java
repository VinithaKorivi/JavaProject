package ZRevisionMulColl;
class MyThread extends Thread{
	public void run() {
		System.out.println("Creating thread using thread class");
	}
}
class MyRunnable implements Runnable{
	public void run() {
		System.out.println("Creating thread using Runnable class");
	}
}
public class ThreadusingThreRunn {

	public static void main(String[] args) {
     MyThread t=new MyThread();
     t.start();
     Thread t1=new Thread(new MyRunnable());
     t1.start();
	}

}
