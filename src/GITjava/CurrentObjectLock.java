package GITjava;
class Display1{
	public void wish(Display1 d, String name) {
		synchronized(d) {
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
}
class Green extends Thread{
	Display1 d;
	String name;
	Green( Display1 d, String name){
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(d, name);
	}
}
public class CurrentObjectLock{
	
	public static void main(String[] args) {
		Display1 d=new Display1();
		Green t1=new Green(d,"dear");
		Green t2=new Green(d, "Friend");
		t1.start();
		t2.start();
	}
}