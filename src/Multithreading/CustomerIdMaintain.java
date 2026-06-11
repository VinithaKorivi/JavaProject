package Multithreading;
class Cmr extends Thread{
	static Integer cusid=0;
	private static ThreadLocal l=new ThreadLocal() {
		protected Integer initialValue() {
			return ++cusid;
		}
	};
	Cmr(String name){
		super(name);
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+"executing with cusid of "+l.get());
	}
}
public class CustomerIdMaintain {

	public static void main(String[] args) {
		Cmr c=new Cmr("Vinithread-1");
		Cmr c1=new Cmr("Vinithread-2");
		Cmr c2=new Cmr("Vinithread-3");
		Cmr c3=new Cmr("Vinithread-4");
		c.start();
		c1.start();
		c2.start();
		c3.start();
	}

}
//ThreadLocal is a class that creates a separate copy of a variable for each thread. 
//Every thread can access and modify its own value independently without affecting other threads. 
//It is commonly used to maintain thread-specific data such as user IDs, database connections, and session information.
