package Multithreading;

public class ThreadKLocal {
  public static void main(String[] args) {
	ThreadGroup system=Thread.currentThread().getThreadGroup().getParent();
	Thread[] a=new Thread[system.activeCount()];
	system.enumerate(a);
	for(Thread t1:a) {
		System.out.println(t1.getName()+"........"+t1.isDaemon());
	}
}
}
