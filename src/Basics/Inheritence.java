package Basics;
class L{
	public void m1() {
		System.out.println("this is the  m1 method of parent class");
	}
	public void m2() {
		System.out.println("this is the m2 method of parent class ");
	}
	public void m3() {
		System.out.println("this is the m3 method of parent class");
	}
	public void m4() {
		System.out.println("this is the m4 method of parent class");
	}
}
class M extends L{
	public void m5() {
		System.out.println("this is the m5 method of child class");
	}
}
public class Inheritence {

	public static void main(String[] args) {
//		M m=new M();
		L m=new M();
		//m.m5();
		m.m1();
		m.m2();
		m.m3();
		m.m4();

	}

}
