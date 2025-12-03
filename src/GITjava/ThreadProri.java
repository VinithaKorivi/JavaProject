package GITjava;

class Test extends Thread
{
	 public void run() {
	 for(int i=0;i<10;i++) {
			System.out.println("Child  Thread");
		}
}
public class ThreadPriorityDemo {

	public static void main(String[] args) {
		System.out.println("My name is vinitha");
        System.out.println("This is me");
		MyThread t=new MyThread();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main Thread");
		}
	}

}}