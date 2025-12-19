package Basics;
abstract class A{
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
	public abstract void m4();
}
public class AbstractMod extends A {

	public static void main(String[] args) {
		AbstractMod n=new AbstractMod();
		n.m1();
		n.m2();
		n.m3();
		n.m4();
	}
	public void m1() {
        System.out.println("m1 implementation");
    }

    public void m2() {
        System.out.println("m2 implementation");
    }

    public void m3() {
        System.out.println("m3 implementation");
    }

    public void m4() {
        System.out.println("m4 implementation");
    }

}
