package zRevision;
class Demo1 implements Runnable{
	public void run() {
		System.out.println("This is runnable implementation");
	}
}
class Demo2 extends Thread{
	public void run() {
		System.out.println("This is thread extended");
	}
}
public class MultiThreading {

	public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName());
    Demo1 d=new Demo1();
    Demo2 t=new Demo2();
    t.start();
    System.out.println("Demo2 thread name is "+t.getName());
    Thread t1=new Thread(d);
    t1.start();
    System.out.println("Demo1 thread name is "+t1.getName());
    Thread.currentThread().setName("Vinitha");
    System.out.println("Current thread name is "+Thread.currentThread().getName());
	}
 
}
