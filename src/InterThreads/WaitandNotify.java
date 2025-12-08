package InterThreads;
class Waiting extends Thread {
	int total=0;
	public void run() {
	synchronized(this) {
			System.out.println("child thread starts execution");
			for(int i=0;i<=5;i++) {
				total=total+i;
			}
			System.out.println("child thread is giving notification");
			this.notify();
		}
	}
}
public class WaitandNotify  {

	public static void main(String[] args) throws InterruptedException {
		Waiting t=new Waiting();
		t.start();
		synchronized(t) {
		System.out.println("main thread is calling wait method");
		t.wait();
		System.out.println("main got notification");
		System.out.println(t.total);
		}
	}

}
