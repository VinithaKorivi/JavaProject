package InterThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Pool implements Runnable{
	String name;
	Pool(String name){
		this.name=name;
	}
	public void run() {
		System.out.println(name+"....job started by thread:"+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		System.out.println(name+"....job completed by thread:"+Thread.currentThread().getName());
	}
}
public class ThreadPoool {

	public static void main(String[] args) {
		Pool[] p= {new Pool("Durga"),
				   new Pool("Vinitha"),
				   new Pool("Ravi"),
				   new Pool("Charii"),
				  };
		ExecutorService s=Executors.newFixedThreadPool(2);
		for(Pool p1:p) {
			s.submit(p1);
		}
        s.shutdown();
	}

}
