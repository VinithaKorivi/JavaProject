package InnerClasses;
class Tested{
	int x=10;
	static int y=20;
	static class Nested{
		public static void main(String[] args) {
			System.out.println("this is static main method present in nested inner class");
//			System.out.println(x);
			System.out.println(y);
		}
	}
}
public class StaticMain {

	public static void main(String[] args) {
		System.out.println("this is main method");
	}

}
