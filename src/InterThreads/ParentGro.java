package InterThreads;

public class ParentGro {
   public static void main(String[] args) {
		Thread t1=new Thread();
		t1.start();
		//System.out.println(t1.activeCount());
		System.out.println(Thread.currentThread().getPriority());
	    System.out.println(Thread.currentThread().getThreadGroup().getName());
     	System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());	
}
}
