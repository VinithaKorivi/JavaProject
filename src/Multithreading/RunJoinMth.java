package Multithreading;
class Test5 extends Thread{
	Thread mt;
	Test5(Thread mt){
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
public class RunJoinMth {

	public static void main(String[] args) throws InterruptedException {
		Thread y=Thread.currentThread();
		Test5 t=new Test5(y);
		t.start();
		for(int i=0;i<=3;i++) {
			System.out.println("main Thread");
			Thread.sleep(2000);
		}
	}

}
