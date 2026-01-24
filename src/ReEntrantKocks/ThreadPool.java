package ReEntrantKocks;
import java.util.concurrent.*;
class Printjob implements Runnable{
	String name;
	Printjob(String name){
		this.name=name;
	}
	public void run() {
		System.out.println(name+"  started by"+Thread.currentThread().getName());
	
	try {
		Thread.sleep(5000);
	}catch(InterruptedException e) {
		
	}
	System.out.println(name+"...job completed by Thread:"+Thread.currentThread().getName());
}}
public class ThreadPool {

	public static void main(String[] args) {
    Printjob[] a= {new Printjob("Accountant"),
    		          new Printjob("Cashier"),
    		          new Printjob("Engineer") };
    ExecutorService service=Executors.newFixedThreadPool(3);
    for( Printjob a1:a) {
    	service.submit(a1);
    }
    service.shutdown();
	}

}
