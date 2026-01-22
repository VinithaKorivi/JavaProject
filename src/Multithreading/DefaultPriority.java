package Multithreading;
class Test10 extends Thread{
	public void run() {
		System.out.println("this is run method");
	}
}
public class DefaultPriority {

	public static void main(String[] args) {
    System.out.println(Thread.currentThread().getPriority());
    Thread.currentThread().setPriority(8);
    System.out.println(Thread.currentThread().getPriority());
    Test10 t=new Test10();
     t.setPriority(10);
     t.start();
     System.out.println("This is main method");
	}

}
