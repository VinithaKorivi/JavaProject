package InnerClasses;

class Test{
    static class Nested{
		public void m1() {
			System.out.println("this is static nested classes");
		}
	}

public class StaticNested {

	public static void main(String[] args) {
//		Test.Nested n=new Test.Nested();
		Nested n=new Nested();
		n.m1();
	}

}}
