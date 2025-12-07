package GITjava;
class Display2{
	public static synchronized void wish(String name) {
		
			for(int i=0;i<=5;i++) {
				System.out.print("Good morning:");
				try {
					Thread.sleep(2000);
				}
				catch(InterruptedException e) 
				{
				}
				System.out.println(name);
			}
		}
	}
class Vini extends Thread{
	String name;
	Vini(String name){
		this.name=name;
	}
	public void run() {
		Display2.wish(name);
	}
}
public class NonStaticSynchronized {

	public static void main(String[] args) {
		Vini t1=new Vini("Ram");
		Vini t2=new Vini("Krishna");
		t1.start();
		t2.start();
}
}
