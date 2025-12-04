package InnerClasses;

public class Outer {
	
    class Inner{
    	public void m1() {
    		System.out.println("inner classs method");
    	}
    	
    }
    public static void main(String[] args) {
		System.out.println("Outer class method");
		Outer o=new Outer();
		Outer.Inner i=o.new Inner();
		i.m1();
	}
    }
    
    

