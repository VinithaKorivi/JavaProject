package Collections;
import java.util.*;
public class IdentityHashMapDemo {

	public static void main(String[] args) {
	IdentityHashMap m=new IdentityHashMap();
//		HashMap m=new HashMap();
		Integer i=new Integer(10);
		Integer i1=new Integer(10);
		m.put(i, "Vini");
		m.put(i1, "Kavya");
		System.out.println(m);
	}

}
