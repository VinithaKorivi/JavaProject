package GITjava;
class B extends Thread{
	public void start() {
		super.start();
		System.out.println("start method");
	}
	public void run() {
		System.out.println("Run method");
	}
}
public class Super {

	public static void main(String[] args) {
		B b=new B();
		b.start();
		System.out.println("main thread");
	}

}
