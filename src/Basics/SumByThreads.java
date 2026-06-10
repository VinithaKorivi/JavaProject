package Basics;
class Add extends Thread{
	int count=0;
	public void run() {
		synchronized(this) {
		System.out.println("the child thread is trying to execute add operation");
		for(int i=1;i<=50;i++) {
		count+=i;
		}
		System.out.println("the child thread is trying to notify after add operation");
		this.notify();
		}
	}
}
public class SumByThreads {

	public static void main(String[] args) throws Exception{
		Add a=new Add();
		a.start();
		synchronized(a) {
			System.out.println("main is going to call add operation");
			a.wait();
			System.out.println("main got notification");
			System.out.println("sum of given number is "+a.count);
		}
	}

}
