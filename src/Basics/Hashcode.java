package Basics;

public class Hashcode {

	public static void main(String[] args) {
		String s1=new String("Durga");
		String s2=new String("Durga");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		StringBuffer  sb=new StringBuffer("Durga");
		StringBuffer sb1=new StringBuffer("Durga");
		System.out.println(sb==sb1);
		System.out.println(sb.equals(sb1));
		System.out.println(sb.hashCode());
		System.out.println(sb1.hashCode());
	}

}
