package InnerClasses;

class Out{
	int x=10;
	static int y=20;
	
	class Inner{
		int x=100;
		public  void m1() {
			int x=1000;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Out.this.x);
			System.out.println(y);
		}
	}
}
public class NormalorRegularInnerClasses {

	public static void main(String[] args) {
		Out o=new Out();
		Out.Inner i=o.new Inner();
		i.m1();

	}

}
