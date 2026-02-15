package Collections;
import java.util.*;
public class TreeeMap {

	public static void main(String[] args) {
   TreeMap m=new TreeMap(); //ascending
//     TreeMap m=new TreeMap(new Test1());    //Descen
     m.put(101,"Vini");
     m.put(102,"Navya");
     m.put(103,"kavya");
     m.put(104,"Suma");
//     m.put(null, 120);
//     m.put("nnnn", "dfgh");
     System.out.println(m);
	}
}
class Test1 implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}