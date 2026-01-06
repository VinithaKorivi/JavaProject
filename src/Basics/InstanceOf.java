package Basics;

public class InstanceOf {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		System.out.println(a instanceof int[]);
        System.out.println(a instanceof Object);
        Object obj="java";
        if(obj instanceof String s) {
        	System.out.println(s.length());
        	Thread t=new Thread();
        	System.out.println(t instanceof Thread);
        	 System.out.println(t instanceof Runnable);
        	 System.out.println(t instanceof Object);
        }
	}

}
