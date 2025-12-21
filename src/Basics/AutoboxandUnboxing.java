package Basics;

public class AutoboxandUnboxing {
  static Integer I=10;
	public static void main(String[] args) {
		int x=I;
		m1(x);
		m2();
	}
	public static void m1(Integer I) {
		int i=I;
		System.out.println(i);
	}
	public static void m2() {
		Integer x=10;
		Integer y=10;
		System.out.println(x==y);
		System.out.println(x.equals(y));
		System.out.println("=============");
		Integer x1=new Integer(10);
		Integer y1=new Integer(10);
		System.out.println(x1==y1);
		System.out.println(x1.equals(y1));
		System.out.println("=============");
		Integer x2=new Integer(10);
		Integer y2=10;
		System.out.println(x2==y2);
		System.out.println(x2.equals(y2));
		System.out.println("=============");
		Integer a=100;
		Integer b=100;
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println("=============");
		Integer c=1000;
		Integer d=1000;
		System.out.println(c==d);
		System.out.println(c.equals (d));
		
	}
	

}
