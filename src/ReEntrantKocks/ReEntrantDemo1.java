package ReEntrantKocks;

import java.util.concurrent.locks.*;

class MyThre {
	ReentrantLock l=new ReentrantLock();
	
	public void wish(String name) {
		l.lock();
		for(int i=0;i<=3;i++) {
			System.out.print("Good Morning  ");
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
		System.out.println(name);
		}
		l.unlock();
	}	
}
class Display2 extends Thread{
	String name;
	MyThre d;
	Display2(String name, MyThre d){
		this.name=name;
		this.d=d;
	}
	public void run() {
		d.wish(name);
	}
}
public class ReEntrantDemo1 {

	public static void main(String[] args) {
		MyThre t=new MyThre();
		Display2 d1=new Display2("Vinitha",t);
		d1.start();
	}

}
