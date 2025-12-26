package Basics;
class Test3{
	public void m1() {
		System.out.println("This is the m1() of test3 class");
	}
	public void m1(int i) {
		System.out.println("entered no is "+i);
	}
	public void m1(int i,int j) {
		System.out.println("the  multiplication of "+i*j);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		Test3 t=new Test3();
		t.m1();
		t.m1(10);
		t.m1(10,20);
		
	}

}
