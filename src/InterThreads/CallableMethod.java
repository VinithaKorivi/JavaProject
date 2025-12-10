package InterThreads;
import java.util.concurrent.*;

class Mycallable implements Callable{
	int num;
	Mycallable(int num){
		this.num=num;
	}
	public Object call() throws Exception{
		System.out.println(Thread.currentThread().getName()+"is responsible to find sum of first"+num+"numbers");
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum=sum+i;
		}
		return sum;
	}
}
public class CallableMethod {

	public static void main(String[] args) throws Exception {
		Mycallable[] c= {new Mycallable(10),
				         new Mycallable(20),
				         new Mycallable(30),
				         new Mycallable(40),
				         new Mycallable(50),
				         };
		ExecutorService s=Executors.newFixedThreadPool(3);
		for(Mycallable c1:c) {
			Future f=s.submit(c1);
			System.out.println(f.get());
		}
		s.shutdown();
		}
	}


