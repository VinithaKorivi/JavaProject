package Multithreading;
class Van extends Thread{
	public void run() {
		for(int i=0;i<=3;i++) {
			System.out.println("This is child Thread");
		}
		System.out.println("I am entering into sleeping state");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println("I got interrupted");
		}
	}
}
public class Interruption {

	public static void main(String[] args) {
		Van v=new Van();
		v.start();
		v.interrupt();
		System.out.println("Main method");
	}

}
