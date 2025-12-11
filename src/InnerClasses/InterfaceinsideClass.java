package InnerClasses;
class Outer8{
	interface test3{
		public void m1();
	}
}
class Mega implements Outer8.test3{
	public void m1() {
		System.out.println("this is interface inside class");
	}
}
public class InterfaceinsideClass {

	public static void main(String[] args) {
		Mega m=new Mega();
		m.m1();
	}

}
