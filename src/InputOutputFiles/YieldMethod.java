package InputOutputFiles;
class Demo4 extends Thread{
	public void run() {
		for(int i=0;i<=2;i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}
public class YieldMethod {

	public static void main(String[] args) throws InterruptedException {
    Demo4 d=new Demo4();
    d.start();
    for(int i=0;i<=2;i++) {
    	System.out.println("main thread");
    }
	}

}
