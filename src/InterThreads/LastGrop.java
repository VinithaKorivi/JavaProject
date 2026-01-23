package InterThreads;
class Demo extends Thread{
	Demo(ThreadGroup g, String name){
		super(g, name);
	}
	public void run() {
		System.out.println("child Thread");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			
		}
	}
}
public class LastGrop {

	public static void main(String[] args) {
		ThreadGroup pg=new ThreadGroup("ParentGroup");
		ThreadGroup cg=new ThreadGroup(pg,"ChildGroup");
		Demo t1=new Demo(pg, "childThread1");
		Demo t2=new Demo(pg, "childThread2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
	}

}
