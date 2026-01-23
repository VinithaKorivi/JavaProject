package Multithreading;
class Display6{
	public synchronized void displayn() {
		for(int i=0;i<=3;i++) {
			System.out.println(i);
		}try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
	}
	public synchronized void displayc() {
		for(int i=65;i<=70;i++) {
			System.out.println((char)i);
		}try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
	}
}
class Remo extends Thread{
	Display6 d;
	Remo(Display6 d){
		this.d=d;
	}
	public void run() {
		d.displayn();
	}
}
class Remo2 extends Thread{
	Display6 d;
	Remo2(Display6 d){
		this.d=d;
	}
	public void run() {
		d.displayc();
	}
}
public class Synchronization {

	public static void main(String[] args) {
      Display6 d=new Display6();
      Remo r=new Remo(d);
      Remo2 r2=new Remo2(d);
      r.start();
      r2.start();
	}

}
