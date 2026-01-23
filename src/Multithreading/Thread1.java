package Multithreading;
class Thread2 extends Thread{
	public void run() {
		System.out.println("This is the child thread of start method");
	}
}
public class Thread1 {

	public static void main(String[] args) {
		Thread2 t=new Thread2();
		t.start();
		System.out.println("This is main method");
	}

}
