package InnerClasses;
class T{
	public void m1()
	{
	    class B{
		   public void m2(int x, int y) {
			   System.out.println(x-y);
		}	
	}
	B b=new B();
	b.m2(10,20);
}
public class MethodLocalInnerClass {

	public static void main(String[] args) {
     	T a=new T();
         a.m1();
	}

}}
