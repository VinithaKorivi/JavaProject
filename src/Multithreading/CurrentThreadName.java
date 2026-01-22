package Multithreading;
class Vini extends Thread{
	public void run() {
		System.out.println("rum method executed by "+Thread.currentThread().getName());
	}
}
public class CurrentThreadName {

	public static void main(String[] args) {
		Vini v=new Vini();
		v.start();
		System.out.println("Main method executed by"+Thread.currentThread().getName());
	}

}
