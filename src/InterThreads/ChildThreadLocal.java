package InterThreads;
class ParentThread extends Thread{
	public static InheritableThreadLocal t=new InheritableThreadLocal() {
		protected Object childValue(Object p) {
			return "cc";
		}	
	};
	public void run() {
		t.set("pp");
		System.out.println("parent thread = "+t.get());
		ChildThread t1=new ChildThread();
		t1.start();
	}
	class ChildThread extends Thread{
		public void run() {
			System.out.println("Child Thread value is= "+ParentThread.t.get());
		}
	}
}
public class ChildThreadLocal {

	public static void main(String[] args) {
		ParentThread p=new ParentThread();
		p.start();
	}

}
