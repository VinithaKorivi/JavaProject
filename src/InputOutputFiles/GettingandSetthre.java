package InputOutputFiles;
class Demo2 extends Thread{
	public void run() {
		for(int i=0;i<=2;i++) {
			System.out.println("This is about getting and setting name of a thread");
		}
	}
}
public class GettingandSetthre {

	public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName());
    Demo2 t=new Demo2();
    t.start();
    System.out.println(t.getName());
    Thread.currentThread().setName("Vinitha");
    System.out.println("current Thread name is "+Thread.currentThread().getName());
	}

}
