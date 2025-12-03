package GITjava;
class R extends Thread{
	static Thread mt;
	public void run() {
			try {
				mt.join();
			}
			catch(InterruptedException e) {
				System.out.println("InterruptedException");
			}
			for(int i=1;i<=5;i++)
			{
				System.out.println("Child Thread");
		}
	}
}
public class ChildJoin {

	public static void main(String[] args) throws InterruptedException  {
		R.mt =Thread.currentThread();
		R t=new R();
		t.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main Thread");
	    }
	
	}

}
