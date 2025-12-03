package GITjava;
 class G implements Runnable{
	 public void run() {
		 System.out.println("Runnable approach");
	 }
 }
public class Runnablemethod {
   public static void main(String[] args) {
	G y=new G();
	Thread t=new Thread(y);
	t.start();
	System.out.println("Main method");
	
}
}
