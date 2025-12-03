package GITjava;
class R extends Thread{
	//static Thread mt;
	Thread mt;
	R(Thread mt){
		this.mt=mt;
	}
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
		Thread y= Thread.currentThread();   //nonstatic
//		R.mt =Thread.currentThread();  static
		R t=new R(y);
		t.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main Thread");
			Thread.sleep(2000);
	    }
	
	}

}
