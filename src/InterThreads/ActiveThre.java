package InterThreads;

public class ActiveThre {

	public static void main(String[] args) {
	
		ThreadGroup sys=Thread.currentThread().getThreadGroup().getParent();
		Thread[] t=new Thread[sys.activeCount()];
		sys.enumerate(t);
		for(Thread t1:t) {
			System.out.println(t1.getName()+"   "+t1.isDaemon());
		}
		System.out.println(sys.activeCount());
		System.out.println(sys.activeGroupCount());
		System.out.println(sys);
	}

}
