package Multithreading;
class Demo1 extends Thread{
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("child thread");
		}
	}
	public void run(int i) {
		System.out.println("This is overloadded method"+"  "+i);
	}
}
public class OverlofRunmeth {

	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.start();
        d.run(10);
	}

}
