package InnerClasses;
class University{
	public void m1() {
		System.out.println("it is outer class");
	}
	class Department{
		public void m2() {
			System.out.println("it is inner class of outer class");
		}
	}
}
public class ClassinsideClass {

	public static void main(String[] args) {
	 University u=new University();
	 u.m1();
	 University.Department d=u.new Department();
	 d.m2();
	}

}
