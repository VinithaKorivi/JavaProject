package Multithreading;
class ParentThread extends Thread{
	public static InheritableThreadLocal t=new InheritableThreadLocal() {
		public Object childValue(Object p) {
			return "cc";
		}
	};
	public void run() {
		t.set("pp");
		System.out.println("parent Thread value is "+t.get());
		ChildThread t=new ChildThread();
		t.start();
	}
}
class ChildThread extends Thread{
	public void run() {
		System.out.println("child thread value is "+ParentThread.t.get());
	}
}
public class InheritableThreadKLocal {

	public static void main(String[] args) {
		ParentThread p=new ParentThread();
		p.start();
	}

}
