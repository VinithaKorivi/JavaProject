package InnerClasses;
class Outerr{
	
    class Inner{
	   public void m1() {
		  System.out.println("Inner class method from outside of outer class");
	   }
	}

}
public class InnerclassfromOuterside {

	public static void main(String[] args) {
	Outerr o=new Outerr();
	Outerr.Inner i=o.new Inner();
	i.m1();
	}

}
