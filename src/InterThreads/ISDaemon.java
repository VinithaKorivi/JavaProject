package InterThreads;

class Table extends Thread{
	
}
public class ISDaemon {

	public static void main(String[] args) {
     System.out.println(Thread.currentThread().isDaemon());
     Table b=new Table();
     b.setDaemon(true);
     b.start();
     System.out.println(b.isDaemon());
    
	
	}

}
