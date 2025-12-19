package Basics;
final class Test2{
	public void p1() {
		System.out.println("this is final class");
	}
}
class Test1{
	public final void m1() {
		System.out.println("this is final method");
	}
}
public class FinalMethclass extends Test1{

	public static void main(String[] args) {
		Test1 t=new Test1();
		t.m1();
		Test2 t1=new Test2();
		t1.p1();
//		m1();

	}
//	public  void m1() {
//		System.out.println("this is overriden method it wont execute");
//	}


}
