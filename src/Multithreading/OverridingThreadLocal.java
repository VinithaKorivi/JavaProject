package Multithreading;

public class OverridingThreadLocal {

	public static void main(String[] args) {
    ThreadLocal l=new ThreadLocal() {
    	public Object initialValue() {
    		return "abc";
    	}
    };
     System.out.println(l.get());
     l.set("Vinitha");
     System.out.println(l.get());
     l.remove();
     System.out.println(l.get());
	}

}
