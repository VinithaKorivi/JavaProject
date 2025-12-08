package InterThreads;
class A{
	public synchronized void d1(B b) {
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{}
		System.out.println("d1 method is calling d2 last()");
		b.last();
}
	public synchronized void last() {
		System.out.println("Inside A this is d1 last()");
	} }
class B{
	public synchronized void d2(A a) {
		try {
			Thread.sleep(2000);
		    }
		catch(InterruptedException e)
		{
			
		}
		System.out.println("d2 method calling d1 last()");
		a.last();
	}
	public synchronized void last() {
		System.out.println("Inside b this is d2 last()");
	}
}
public class DeadLock1  extends Thread{
	A a=new A();
	B b=new B();
	public void m1() {
		this.start();
//		a.d1(b);
		b.d2(a);
	}
	public void run() {
//		b.d2(a);
		a.d1(b);
	}
	public static void main(String[] args) {
		 DeadLock1 d = new  DeadLock1();
		 d.m1();
	}

}
