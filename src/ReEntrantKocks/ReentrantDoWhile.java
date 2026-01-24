package ReEntrantKocks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Dowhile extends Thread{
	static ReentrantLock l=new ReentrantLock();
	Dowhile(String name){
		super(name);
	}
	public void run() {
		do {
			try {
				if(l.tryLock(5000,TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName()+"  got lock");
					Thread.sleep(20000);
					l.unlock();
					System.out.println(Thread.currentThread().getName()+"..going to Release lock");
					break;
				}else {
					System.out.println(Thread.currentThread().getName()+"......didn't got lock and will try again");
				}
				
			}catch(InterruptedException e) {
				
			}
			
		}
		while(true);
	}
}
public class ReentrantDoWhile {

	public static void main(String[] args) {
		Dowhile d=new Dowhile("First thread");
		Dowhile d1=new Dowhile("second thread");
		d.start();
		d1.start();
	}

}
