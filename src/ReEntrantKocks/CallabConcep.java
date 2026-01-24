package ReEntrantKocks;

import java.util.concurrent.*;
class Printjob1 implements Callable{
	int num;
	Printjob1(int num){
		this.num=num;
	}
	public Object call() throws Exception {
		System.out.println("  started by"+Thread.currentThread().getName()+"is responsible to find sum of"+num+"numbers");
	    int sum=0;
	    for(int i=0;i<num;i++) {
	    	sum+=i;
	    }
	    return sum;
	}	
}
public class CallabConcep {

	public static void main(String[] args) throws Exception {
    Printjob1[] a= {new Printjob1(30),
    		          new Printjob1(20),
    		          new Printjob1(30),
    		          new Printjob1(50),
    		          new Printjob1(40) };
    ExecutorService service=Executors.newFixedThreadPool(3);
    for( Printjob1 a1:a) {
    	Future t=service.submit(a1);
    	System.out.println(t.get());
    	
    }
    service.shutdown();
	}

}