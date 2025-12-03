package GITjava;
class C extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Child thread");
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			
		}
		}
	}
}
public class JoinMethod {

	public static void main(String[] args) throws InterruptedException {
		C v= new C();
		v.start();
		v.join();
		for(int i=0;i<=10;i++) {
		System.out.println("Main method");
		
	}}

}
