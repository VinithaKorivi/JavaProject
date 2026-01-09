package PracticePrograms;
class PARENT{
	protected  int amount=456789;
}
public class PUBLICAccessMod {
public static void m1() {
	System.out.println("This is the public method");
}
 protected void m2() {
	System.out.println("This is the protected m2 method of public class");
}

	public static void main(String[] args) {
		int balance=10000;
		PUBLICAccessMod a=new PUBLICAccessMod();
		a.m2();
        m1();
	}

}
