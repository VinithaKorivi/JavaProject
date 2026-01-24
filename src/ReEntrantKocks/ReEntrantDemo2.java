package ReEntrantKocks;

import java.util.concurrent.locks.ReentrantLock;

class Enter extends Thread{
	static ReentrantLock l=new ReentrantLock();
	Enter(String name){
		super(name);
	}
	public void run() {
		if(l.tryLock()) {
			System.out.println(Thread.currentThread().getName()+"...got lock andperforming operations");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
		l.unlock();
		}
		else {
			System.out.println(Thread.currentThread().getName()+".....Failed to get lock and will try again");
		}
	}
	}

public class ReEntrantDemo2 {

	public static void main(String[] args) {
		Enter e1=new Enter("First Thread");
		Enter e2=new Enter("second Thread");
		e1.start();
		e2.start();
		
	}

}
