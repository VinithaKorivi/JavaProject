package GITjava;
class H extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Child thread");
			Thread.yield();
		}
	}
}
public class YieldMethod {

	public static void main(String[] args) {
		H t=new H();
		t.start();
		for(int i=0;i<=10;i++) {
			System.out.println("main thread");
		}
	}

}
