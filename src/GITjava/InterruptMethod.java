package GITjava;
class V extends Thread{
	public synchronized void run() {
			for(int i=0;i<=5;i++) {
				System.out.println("This is child thread");
	
			}
		   System.out.println("Iam entering into sleeping state");
		   try {
			   Thread.sleep(2000);
			}
			catch(InterruptedException e) 
		    {
				System.out.println("I got interrupted");
			}
		}
}
public class InterruptMethod {

	public static void main(String[] args) {
		V t=new V();
		t.start();
		t.interrupt();
		System.out.println("Main method");
	}

}
