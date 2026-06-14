package InputOutputFiles;
class Demo6 extends Thread{
	public void run() {
		for(int i=0;i<=3;i++) {
			System.out.print("Child Thread ");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				System.out.print("I got interrupted");
			}
			System.out.println(" is running");
		}
		
	}
}
public class SlemethodTo {

	public static void main(String[] args) {
		Demo6 d=new Demo6();
		d.start();
		for(int i=0;i<=3;i++) {
			System.out.println("Main Thread ");
		}
	}

}
