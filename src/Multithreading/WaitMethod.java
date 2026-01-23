package Multithreading;
class Waiting extends Thread{
	int total=0;
	public void run() {
		synchronized(this) {
			System.out.println("Child thread starts calculation");
			for(int i=0;i<10;i++) {
				total+=i;
			}
			System.out.println("Child thread is trying to give notification");
			this.notify();
		}
	}
}
public class WaitMethod {

	public static void main(String[] args) throws InterruptedException{
		Waiting w=new Waiting();
		w.start();
		synchronized(w) {
			System.out.println("main thread trying to call wait method");
			w.wait();
			System.out.println("main method got notification");
			System.out.println(w.total);
		}
	}

}
