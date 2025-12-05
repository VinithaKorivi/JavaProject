package InnerClasses;

public class ThreadAnonymousApproach {

	public static void main(String[] args) {
		Thread t=new Thread()
	   {
		public void run() 
		{
			for(int i=0;i<=5;i++) {
				System.out.println("anonymous run method");
			}
		}
	   };
	   t.start();
	   for(int i=0;i<=5;i++) {
			System.out.println("main method");
		}
	}

}
