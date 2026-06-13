package InputOutputFiles;
class Demo3 extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("is related to gett and sett thread priorities");
			System.out.println(Thread.currentThread().getPriority());
		}
	}
}
public class ThreadPriorities {

	public static void main(String[] args) throws Exception{
    System.out.println(Thread.currentThread().getPriority());
    Demo3 t=new Demo3();
    t.setPriority(8);
    t.start();
    t.join(); 
    System.out.println("Main thread");
	}

}
