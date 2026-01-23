package Multithreading;
class A{
	public synchronized void d1(B b) {
	 System.out.println("a class starts the execution");
	 b.last();
	}
	 public synchronized void last() {
	        System.out.println("Inside A this is last()");
	    }
}
class B{
	public synchronized void d2(A a) {
		 System.out.println("b class starts the execution");
		 a.last();
		}
	 public synchronized void last() {
	        System.out.println("Inside B it is last()");
	    }
	
}
public class DeadLock extends Thread {
   A a=new A();
   B b=new B();
   public void m1() {
	   this.start();
	   a.d1(b);
   }
   public void run() {
	   b.d2(a);
   }
	public static void main(String[] args) {
		DeadLock d=new DeadLock();
		d.m1();
	}

}
