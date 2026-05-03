package ACollections;
import java.util.*;             //demo prog of concurrent modificaton
public class Concurrent extends Thread {
	static ArrayList l=new ArrayList();
    public void run() {
    	try {
    		Thread.sleep(2000);
    	}catch(InterruptedException e) {  }
    		System.out.println("child thread updating list");
    		l.add("a");
    	
    }
	public static void main(String[] args) throws InterruptedException {
		l.add("h");
		l.add("g");
		l.add("p");
		l.add("z");
		Concurrent c=new Concurrent();
		c.start();
//		c.join();
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			String s1=(String)itr.next();
			System.out.println("main thread iterating list and current object is "+s1);
			Thread.sleep(3000);
		}
     System.out.println(l);
	}

}
