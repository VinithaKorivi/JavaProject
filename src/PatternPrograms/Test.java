package PatternPrograms;
class Out{
	protected int x=23456789;
	protected void method() {
		System.out.println("My name is Vinitha");
	}
}
public class Test extends Out{

	public static void main(String[] args) {
		Out o=new Out();
		o.method();
		
	}

}
