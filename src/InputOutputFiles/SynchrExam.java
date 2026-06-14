package InputOutputFiles;
class A extends Thread{
	public synchronized void dis1(B b) {
		System.out.println("Thread 1 starts executing");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
		System.out.println("Thread 1 calling b's last method");
		b.last();
		
	}
	public synchronized void last() {
		System.out.println("This is b's last method present in A");
	}
}
class B extends Thread{
	public synchronized void dis2(A a) {
		System.out.println("Thread 2 starts executing");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
		System.out.println("Thread 2 calling a's last method");
		a.last();
	}
	public synchronized void last() {
		System.out.println("This is b's last method present in A");
	}
}
public class SynchrExam extends Thread{
  A a=new A();
  B b=new B();
  public void m1() {
	  this.start();
	  a.dis1(b);
  }
  public void run() {
	  b.dis2(a);
  }
	public static void main(String[] args) {
		SynchrExam sd=new SynchrExam();
		sd.m1();
	}

}
