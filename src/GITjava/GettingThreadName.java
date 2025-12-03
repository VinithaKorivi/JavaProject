package GITjava;
class D extends Thread{
	public void run() {
		System.out.println("run method executed by thread="+Thread.currentThread().getName());
	}
}
class E extends Thread{
}
public class GettingThreadName {
	
	    public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		D r=new D();
		r.start();
		System.out.println(r.getName());
		E t=new E();
		System.out.println(t.getName());
		Thread.currentThread().setName("Vinitha");
		System.out.println(Thread.currentThread().getName());
	}

}
