package InputOutputFiles;
class Demo extends Thread{
	public void run() {
		System.out.println("This is child thread");
	}
}
public class ThreadExtending {

	public static void main(String[] args) {
		Demo t=new Demo();
		t.start();
		System.out.println("Main Thread");
	}

}
