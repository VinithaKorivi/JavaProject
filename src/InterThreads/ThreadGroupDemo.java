package InterThreads;

public class ThreadGroupDemo {

	public static void main(String[] args) {
	ThreadGroup g1=new ThreadGroup("tg");
	ThreadGroup g2=new ThreadGroup("FirstGroup");
	System.out.println(g1.getParent().getName());
	System.out.println("llllllll");
	
	System.out.println(g2.getParent().getName());
	System.out.println(g1.getMaxPriority());
	g1.setMaxPriority(8);
	System.out.println(g1.activeCount());
	System.out.println(g1.getMaxPriority());
	g1.list();
	System.out.println("===========");
	System.out.println(g1.activeCount());
	System.out.println(g1.activeGroupCount());
	
	}

}
