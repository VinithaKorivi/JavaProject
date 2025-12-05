package InnerClasses;

public class RunnableAnonymous {

	public static void main(String[] args) {
		Runnable r=new Runnable()
		{
			public void run() {
				for(int i=0;i<=5;i++) {
					System.out.println("runnable child thread");
				}
			}
			
		};
		Thread t=new Thread(r);
        t.start();
        for(int i=0;i<=5;i++) {
			System.out.println("runnable main thread");
		}
	}

}
