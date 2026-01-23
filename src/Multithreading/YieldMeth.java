package Multithreading;
class Test3 extends Thread{
	public void run() {
		for(int i=0;i<=3;i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}
public class YieldMeth {

	public static void main(String[] args) {
		Test3 t=new Test3();
		t.start();
		for(int i=0;i<=3;i++) {
			System.out.println("Main method");
		}
	}

}
