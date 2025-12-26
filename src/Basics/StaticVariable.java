package Basics;
 class D{
	 static int i;
	 public static void m1() {
		 System.out.println("This is static so can be accessed by classname");
	 }
 }
public class StaticVariable {

	public static void main(String[] args) {
		System.out.println(D.i);
		D.i=100;
		System.out.println(D.i);
		D d1=new D();
		D d2=new D();
		System.out.println(d1.i);
		System.out.println(d2.i);
		d1.i=45;
		System.out.println(d1.i);
		System.out.println(d2.i);
		D.m1();
	}

}
