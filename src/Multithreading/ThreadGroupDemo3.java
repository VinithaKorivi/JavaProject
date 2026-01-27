package Multithreading;
class YouThread extends Thread{
	YouThread(ThreadGroup g,String name){
		super(g,name);
	}
	public void run() {
		System.out.println("child Thread");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			
		}
	}
}
public class ThreadGroupDemo3{

	public static void main(String[] args)  throws Exception {
   ThreadGroup pg=new ThreadGroup("parentGroup");
   ThreadGroup cg=new ThreadGroup("ChildGroup");
   YouThread t1=new YouThread(pg,"ChildThread1");
   YouThread t2=new YouThread(cg,"ChildThread1");
   t1.start();
   t2.start();
   
	}

}
