package InnerClasses;

public class InnerclassfromInstancearea {
	class Inner{
	public void m1() {
		System.out.println("inner class method m1");
	}
	}
	public void m2() {
		System.out.println("instance area is calling inner class");
		Inner i=new Inner();
		i.m1();
	}

	public static void main(String[] args) {
		System.out.println("main method is calling instance area");
		InnerclassfromInstancearea o=new InnerclassfromInstancearea();
		o.m2();
	}

}
