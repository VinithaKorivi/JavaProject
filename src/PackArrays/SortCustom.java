package PackArrays;
import java.util.*;
public class SortCustom {

	public static void main(String[] args) {
     ArrayList l=new ArrayList();
     l.add("Z");
     l.add("A");
     l.add("K");
     l.add("L");
     l.add("P");
     System.out.println("Before sorting" +l);
     Collections.sort(l, new Demo());
     System.out.println("After sorting "+l);
	}

}
class Demo implements Comparator{
	public int compare(Object obj1, Object obj2) {
		String s1=(String)obj1;
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}