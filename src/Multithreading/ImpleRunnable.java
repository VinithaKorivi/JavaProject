package Multithreading;
class Demo3 implements Runnable{
	public void run() {
		System.out.println("This is runnable implementation");
	}
}
public class ImpleRunnable {

	public static void main(String[] args) {
		Demo3 d=new Demo3();
		Thread t=new Thread(d);
		t.start();
	}

}
