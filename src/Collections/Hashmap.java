package Collections;

import java.util.*;

public class Hashmap {

	public static void main(String[] args) {
    HashMap m=new HashMap();
    m.put("Vini", 101);
    m.put("Kavya", 102);
    m.put("Rani", 103);
    m.put("Maya", 104);
    System.out.println(m);
    System.out.println(m.put("Queen", 100));
    Set s=m.keySet();
    System.out.println(s);
    Collection c=m.values();
    System.out.println(c);
    Set e=m.entrySet();
    System.out.println(e);
    Iterator itr=e.iterator();
    while(itr.hasNext()) {
    	Map.Entry m1=(Map.Entry)itr.next();
    	if(m1.getKey().equals("Rani")) {
    		m1.setValue(100000);
    	}
    }
    System.out.println(m);
	}

}
