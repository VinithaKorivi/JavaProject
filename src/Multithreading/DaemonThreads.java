package Multithreading;
class Class extends Thread{
	public void run() {
		System.out.println("run method");
	}
}
public class DaemonThreads {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon()+" it is non Daemon thread");
		Class c=new Class();
		c.setDaemon(true);
		c.start();
		System.out.println(c.isDaemon()+" it is daemon thread");
		System.out.println(Thread.currentThread().getThreadGroup());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
//    System.out.println(Thread.currentThread().isDaemon());
//    Thread.currentThread().setDaemon(true);
//    System.out.println(Thread.currentThread().isDaemon());
	}

}
