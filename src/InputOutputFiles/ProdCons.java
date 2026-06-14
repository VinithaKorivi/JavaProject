package InputOutputFiles;
class Factory{
	int item;
	boolean available=false;
	public synchronized void producer(int value) {
		try {
			if(available) {
				wait();
			}
			item=value;
			available=true;
			System.out.println("produced item= "+item);
			notify();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	public synchronized void consumer() {
		
		try {
			if(!available) {
				wait();
			}

			System.out.println("consumed item= "+item);
			available=false;
			notify();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class Produce extends Thread{
	Factory f;
	Produce(Factory f){
		this.f=f;
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			f.producer(i);
		}
	}
	
}
class Consume extends Thread{
	Factory f;
	Consume(Factory f){
		this.f=f;
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			f.consumer();
		}
	}
}
public class ProdCons {

	public static void main(String[] args) {
		Factory f=new Factory();
		
		Produce p=new Produce(f);
		Consume c=new Consume(f);
		p.start();
		c.start();
	}

}
