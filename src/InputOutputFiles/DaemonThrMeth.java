package InputOutputFiles;
class MyThread extends Thread{
	
}
public class DaemonThrMeth {

	public static void main(String[] args) {
    System.out.println("Daemon nature of main thread is "+Thread.currentThread().isDaemon());
    MyThread t=new MyThread();
    t.setDaemon(true);
    System.out.println("Daemon nature of MyThread is "+t.isDaemon());
	}

}
