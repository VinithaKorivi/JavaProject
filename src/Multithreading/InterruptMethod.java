package Multithreading;
class Test6 extends Thread{
	Thread mt;
	Test6(Thread mt){
		this.mt=mt;
	}
	public void run() {
		try {
			mt.join();
		}catch(InterruptedException e) {
			
		}
		for(int i=0;i<=3;i++) {
			System.out.println("Child Thread");
		}
	}
}
public class InterruptMethod {

	public static void main(String[] args) throws InterruptedException {
		Thread y=Thread.currentThread();
		Test6 t=new Test6(y);
		t.start();
		t.interrupt();
		for(int i=0;i<=3;i++) {
			System.out.println("main Thread");
			Thread.sleep(2000);
		}
	}

}