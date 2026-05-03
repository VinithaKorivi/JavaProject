package ZRevisionMulColl;
class A {
	public synchronized void methodA(B b) {
		System.out.println("A method");
		  try { Thread.sleep(100); } catch (Exception e) {}
		b.last();
	}public synchronized void last() {
		System.out.println("a's last");
	}
	
}
class B {
	public synchronized void methodB(A a) {
		System.out.println("B method");
		  try { Thread.sleep(100); } catch (Exception e) {}
		a.last();
	}
	public synchronized void last() {
		System.out.println("b's last");
	}
}
public class DeadLock {

	public static void main(String[] args) {
    A a=new A();
    B b=new B();
    Thread t1 = new Thread(() -> a.methodA(b));
    Thread t2 = new Thread(() -> b.methodB(a));

    t1.start();
    t2.start();
	}

}
