package InnerClasses;

//public class Innerrevision {
//	class Inner{
//		public void m2() {
//			System.out.println("Inner class");
//		}
//	}
//
//	public static void main(String[] args) {
//		Innerrevision v=new Innerrevision();
//		Innerrevision.Inner r=v.new Inner();
//		r.m2();
//		System.out.println("********");
//		Innerrevision.Inner t=new Innerrevision().new Inner();
//		t.m2();
//		System.out.println("********");
//		new Innerrevision().new Inner().m2();
//	}
//
//}
//************************************************************************************************************************************
//public class Innerrevision {
//	class Inner{
//		public void m1() {
//			System.out.println("This is outer class acces from instace of outer");
//		}
//	}
//	public void m2() {
//		Inner i=new Inner();
//		i.m1();
//	}
//	public static void main(String[] args) {
//		Innerrevision v=new Innerrevision();
//		v.m2();
//	}
//}
//************************************************************************************************************************************
class Outer11{
	class Inner{
		public void m1() {
			System.out.println("this is inner class acces from out of outer class");
		}
	}
}
public class Innerrevision{
	
	public static void main(String[] args) {
		new Outer11().new Inner().m1();
	}
}