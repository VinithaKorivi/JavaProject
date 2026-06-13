package Basics;
class Show{
	public synchronized void visible(String name) {
		for(int i=0;i<=3;i++) {
			System.out.println("synchronization method is executing");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				System.out.println("i got interrupted");
			}
		}
	}	
}
class Demoe extends Thread{
	String name;
	Show s;
	public Demoe(String name, Show s) {
		this.name=name;
		this.s=s;
	}
	public void run() {
		s.visible(name);
	}
}
public class SynchronizedMeth {

	public static void main(String[] args) {
		Show s=new Show();
		Demoe d=new Demoe("Vinitha",s);
		d.start();
	}

}
