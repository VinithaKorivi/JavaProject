package Collections;

import java.util.*;

public class ExStrBuff {

	public static void main(String[] args) {
   TreeSet t=new TreeSet(new MyCode());
   t.add("A");
   t.add("AAA");
   t.add(new StringBuffer("Ravi"));
   t.add(new StringBuffer("Bavya"));
   t.add("ABCD");
   t.add("King");
   t.add(new StringBuffer("Queeen"));
   t.add(new StringBuffer("Yamuna"));
   t.add("Hrtyv");
   t.add(new StringBuffer("Vinitha"));
   System.out.println(t);
	}

}
class MyCode implements Comparator{
	public int compare(Object Obj1,Object Obj2) {
		String s1=Obj1.toString();
		String s2=Obj2.toString();
		int l1=s1.length();
		int l2=s2.length();
		if(l1<l2) {
			return -1;
		}else if(l1>l2) {
			return 1;
		}else return s1.compareTo(s2);
	}
}