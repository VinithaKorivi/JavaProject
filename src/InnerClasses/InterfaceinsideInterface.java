package InnerClasses;
interface Vehicl{
	public int m1();
	interface Behicl2{
		public int m2();
	}
}
class Test1 implements Vehicl{
	public int m1() {
		return 3;
	}
}
class Test2 implements Vehicl.Behicl2{
	public int m2() {
		return 11;
	}
}
public class InterfaceinsideInterface {

	public static void main(String[] args) {
		Test1 t=new Test1();
		System.out.println(t.m1());
		Test2 t2=new Test2();
		System.out.println(t2.m2());
		
	}

}
