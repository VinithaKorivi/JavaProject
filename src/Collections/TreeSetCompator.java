package Collections;
import java.util.*;
class Mycomaparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s1=(String)obj1;
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}
public class TreeSetCompator {

	public static void main(String[] args) {
   TreeSet t=new TreeSet(new Mycomaparator());
   t.add("Roja");
   t.add("Satya");
   t.add("Rani");
   t.add("Ganaga");
   t.add("Ramya");
   System.out.println(t);
	}

}
