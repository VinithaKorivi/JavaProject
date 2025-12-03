package GITjava;
class Display{
	
	public synchronized void wish(String name) 
	{
		for(int i=0;i<5;i++) 
		{
			System.out.print("Good Morning: ");
			try {
				Thread.sleep(2000);
			  }
			catch(InterruptedException e) {}
			System.out.println(name);
		}
	}
	
}
class Q extends Thread{
	Display d;
	String name;
	Q(Display d,String name){
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
	}
}
public class SynchronizedKeyword {

	public static void main(String[] args) {
		Display d=new Display();
		//Display d2=new Display();
		Q t1=new Q(d, "Dhoni");
		Q t2=new Q(d, "Lal");
		t1.start();
		t2.start();
	}

}
