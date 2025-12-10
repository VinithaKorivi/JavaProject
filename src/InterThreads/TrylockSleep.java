package InterThreads;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Sleep extends Thread{
	static ReentrantLock l = new ReentrantLock();
	Sleep(String name){
		super(name);
	}
	public void run() {
		do {
			try {
			if(l.tryLock(5000, TimeUnit.MILLISECONDS)) {
				System.out.println(Thread.currentThread().getName()+""+"got Lock");
				Thread.sleep(30000);
				l.unlock();
				System.out.println(Thread.currentThread().getName()+""+"releases lock");
				break;
			}
			else {
				System.out.println(Thread.currentThread().getName()+""+"unable to get lock and will try again");
			}
		    }
			catch(InterruptedException e) {}
			}
		
		while(true);
	}
}
public class TrylockSleep {

	public static void main(String[] args) {
    Sleep t1=new Sleep("Green");
    Sleep t2=new Sleep("second");
    t1.start();
    t2.start();
	}

}
