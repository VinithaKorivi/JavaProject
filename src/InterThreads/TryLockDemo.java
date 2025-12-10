package InterThreads;
import java.util.concurrent.locks.ReentrantLock;
class Test   extends Thread{
	static ReentrantLock l=new ReentrantLock();
	Test(String name){
		super(name);
	}
	public void run() {
		if(l.tryLock()) {
			System.out.println(Thread.currentThread().getName()+"got lock and performing safe operations");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) 
			{}	
			l.unlock();
		}
		else {
			System.out.println(Thread.currentThread().getName()+"unable to get lock "
					+ "and performming alternative operations");
		}
	}
}
public class TryLockDemo {

	public static void main(String[] args) {
		Test t1=new Test("FirstThread");
		Test t2=new Test("2ndThread");
		t1.start();
		t2.start();
				
	}

}
