package InterThreads;
import java.util.concurrent.locks.ReentrantLock;
class Disp {
	ReentrantLock l=new ReentrantLock();
	public void Wish(String name) {
		l.lock();
		for(int i=0;i<=2;i++) {
			System.out.print("Good Morning:");
			try {
				Thread.sleep(2000);
		   }
		catch(InterruptedException e) 
			{}
		System.out.println(name);
	}
	l.unlock();
}}
class MtThread2 extends Thread{
	Disp d;
	String name;
	MtThread2(Disp d, String name){
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.Wish(name);
	}
}
public class ReEntrantEx {

	public static void main(String[] args) {
		Disp d=new Disp();
		MtThread2 t1=new MtThread2(d, "Dhoni");
		MtThread2 t2=new MtThread2(d, "green");
		MtThread2 t3=new MtThread2(d, "dog");
		t1.start();
		t2.start();
		t3.start();
	}

}
