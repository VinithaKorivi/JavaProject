package Multithreading;
class CustomerThread extends Thread{
	static Integer cusid=0;            //Integer
	private static ThreadLocal l=new ThreadLocal() {
		public Object initialValue() {
			return ++cusid;
		}
	};
	CustomerThread(String name){
		super(name);
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+"executing with cusid="+l.get());
	}
}
public class ThreadLocalExp {

	public static void main(String[] args) {
     CustomerThread c1=new CustomerThread("Customer_Thread1 ");
     c1.start();
     CustomerThread c2=new CustomerThread("Customer_Thread2 ");
     c2.start();
     CustomerThread c3=new CustomerThread("Customer_Thread3 ");
     c3.start();
     CustomerThread c4=new CustomerThread("Customer_Thread4 ");
     c4.start();
	}

}
