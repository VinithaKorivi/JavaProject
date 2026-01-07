package PracticePrograms;

public class EqualityOpera {

	public static void main(String[] args) {
		int a=10;
		double b=10.0;
		System.out.println(a==b);
		System.out.println("**************");
		System.out.println('A'==65);
	   System.out.println(true==false);
	   Integer x=127;
	   Integer y=127;
	   System.out.println(x==y);
	   Integer x1=128;
	   Integer y1=128;
	   System.out.println(x1==y1);
	   System.out.println("**************");
	//   Character c1=65;
	//   Character c2='A';
	   Character c1='a';
	   Character c2='a';
	   System.out.println(c1==c1);
	   float f=0.1f;
	   double f1=0.1;
	   System.out.println(f==f1);
	   double d = Double.NaN;
	   System.out.println(d == d);
	   System.out.println(d != d);
	   String s1="java";
		String s2="developer";
		System.out.println(s1==s2);
		String s3="java";
		System.out.println(s1==s3);
		System.out.println("********");
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
//		System.out.println(!4);
		System.out.println(!true);
		System.out.println(!false);


	}

}
