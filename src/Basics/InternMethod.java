package Basics;

public class InternMethod {

	public static void main(String[] args) {
		String s1=new String("durga");
		String s2=s1.intern();
		System.out.println(s1==s2);
		String s3="durga";
		System.out.println(s2==s3);
		String s4=new String("durga ");
		String s5=s4.concat("solutions");
		String s6=s5.intern();
		System.out.println(s5==s6);
		String s7="durga solutions";
		System.out.println(s6==s7);
	}

}
