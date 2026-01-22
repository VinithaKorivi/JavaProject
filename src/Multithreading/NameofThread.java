package Multithreading;
class De extends Thread{
	
}
class Der extends Thread{
	
}
public class NameofThread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Vinitha");
		System.out.println(Thread.currentThread().getName());
		De d=new De();
		System.out.println(d.getName());
		Der d1=new Der();
		System.out.println(d1.getName());
	}

}
