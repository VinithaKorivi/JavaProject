package InterThreads;
class Room extends Thread{
	
}
public class ThreadGroupName {

	public static void main(String[] args) {
		Thread t1=new Thread();
		t1.start();
		System.out.println(t1.activeCount());
		System.out.println(Thread.currentThread().getPriority());
	    System.out.println(Thread.currentThread().getThreadGroup().getName());
     	System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		ThreadGroup g1=new ThreadGroup("FirstGroup");
		System.out.println(g1.getParent().getName());
		System.out.println("llllllll");
		ThreadGroup g2=new ThreadGroup(g1, "Second");
		System.out.println(g2.getParent().getName());
		System.out.println(g1.getMaxPriority());
		g1.setMaxPriority(8);
		System.out.println(g1.activeCount());
		System.out.println(g1.getMaxPriority() );
		g1.list();
		System.out.println("===========");
		System.out.println(g1.activeCount());
		System.out.println(g1.activeGroupCount());
		
		
}
}