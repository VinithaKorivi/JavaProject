package ZRevisionMulColl;
class Thread1 extends Thread{
	public synchronized void run() {
		for(int i=1;i<=10;i++) {
			System.out.print(i+"  ");
		}
		System.out.println();
	}
}
class Thread2 extends Thread{
	public synchronized void run() {
		for(int i=10;i>0;i--) {
			System.out.print(i+"  ");
		}
	}
}
public class Printnousing2Threads  {

	public static void main(String[] args) throws Exception {
		Thread1 t=new Thread1();
		t.start();
		t.join();
		Thread2 t1=new Thread2();
		
		t1.start();
	}

}
