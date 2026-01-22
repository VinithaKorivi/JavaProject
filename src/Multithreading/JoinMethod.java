package Multithreading;
class Test4 extends Thread{
	public void run() {
		for(int i=0;i<=3;i++) {
			System.out.println("Child thread");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e){
				
			}
		}
	}
}
public class JoinMethod {

	public static void main(String[] args) throws InterruptedException {
		Test4 t=new Test4();
		t.start();
		t.join();
		for(int i=0;i<=3;i++) {
			System.out.println("main thread");
//			Thread.sleep(2000);
		}
	}

}
