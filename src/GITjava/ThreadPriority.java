package GITjava;
class F extends Thread{
	public void run() {
		System.out.println("Child thread is executing first and  priority is="+Thread.currentThread().getPriority());
	}
}
public class ThreadPriority {

	public static void main(String[] args) {
	F t=new F();
	t.setPriority(10);
	t.start();
	System.out.println("Main Thread priority is="+Thread.currentThread().getPriority());
	for(int i=0;i<=10;i++) {
		System.out.println("Main Thread");
	}

	}

}
