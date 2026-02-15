package Collections;
import java.util.*;
public class IdentityHash {

	public static void main(String[] args) {
	IdentityHashMap m=new IdentityHashMap();
//     HashMap m=new HashMap();
     Integer I=new Integer(10);
     Integer I1=new Integer(10);
     m.put(I,"Pawan");
     m.put(I1,"swetha");
     System.out.println(m);
	}

}
