package PracticePrograms;
class Test1 //extends Test2
{
	final static int x=10;
	public final void m1() {
		System.out.println("this is test1 method");
	}
}
public class FinalClassMethodVari           // extends Test2
{
 
	public static void main(String[] args) {
//     System.out.println(x); b/c var is final
		Test2 t=new Test2();
		t.m1();
	}

}
final class Test2{
	public final void m1() {
		System.out.println("this is the final class");
	}
}