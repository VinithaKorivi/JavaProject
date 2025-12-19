package Basics;
class Test{
	public void m1() {
		System.out.println("this is public the m1 method");
	}
}
public class Modifiers {
    public static void main(String[] args) {
	  Test t=new Test();
	  t.m1();
	  Modifiers m=new Modifiers();
	  m.m2();
     }
    private  void m2() {
		  System.out.println("this is private m2 method");
	  }
}
