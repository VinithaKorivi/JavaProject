package zRevisionCORE;
class Nand{
	public  synchronized void wish(String name) {
		for(int i=1;i<5;i++) {
		System.out.print("My name is ");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
		System.out.println(name);
	}}
}
class Test1 extends Thread{
	Nand n;
	String name;
	 Test1(Nand n, String name){
		 this.n=n;
		 this.name=name;
	 }
	 public void run() {
		 n.wish(name);
	 }
}
public class Synchronization {

	public static void main(String[] args) {
		Nand n=new Nand();
		Test1 t=new Test1(n, "vini");
		Test1 t1=new Test1(n,"divya");
		t.start();
		t1.start();
	}

}
