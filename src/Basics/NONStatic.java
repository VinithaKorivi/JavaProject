package Basics;
class E{
	int i;
	public void m2() {
		System.out.println("This is the non static method");
	}
}
public class NONStatic {
	
	public static void main(String[] args) {
		E e1=new E();
		E e2=new E();
		E e3=new E();
		System.out.println(e1.i);
		e1.i=100;
		e2.i=200;
		e3.i=300;
		System.out.println(e1.i);
		System.out.println(e2.i);
		System.out.println(e3.i);
         e1.m2();
	}

}
