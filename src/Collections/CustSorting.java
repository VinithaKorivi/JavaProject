package Collections;
import java.util.*;
class Demo implements Comparator{
	public int compare(Object obj1, Object obj2) {
		String s1=(String)obj1;
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}
public class CustSorting {

	public static void main(String[] args) {
      ArrayList l=new ArrayList();
      l.add("z");
      l.add("a");
      l.add("y");
      l.add("U");
      l.add("R");
      System.out.println(l);
      Collections.sort(l);
      System.out.println(l);
      Collections.sort(l, new Demo());
      System.out.println(l);
      System.out.println(Collections.binarySearch(l, "z", new Demo()));
      System.out.println(Collections.binarySearch(l, "y", new Demo()));
      System.out.println(Collections.binarySearch(l, "t", new Demo()));
	}

}
