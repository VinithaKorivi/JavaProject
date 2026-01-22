package Multithreading;
class Demo2 extends Thread{
	public void start() {
		super.start();
		System.out.println("This is start method");
	}
	public void run() {
     System.out.println("This is run method");
	}
}
public class OverrStartMeth {

	public static void main(String[] args) {
		Demo2 d=new Demo2();
		d.start();
	}

}
