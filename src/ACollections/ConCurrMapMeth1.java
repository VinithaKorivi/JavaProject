package ACollections;
import java.util.concurrent.*;
public class ConCurrMapMeth1 {

	public static void main(String[] args) {
   ConcurrentHashMap m=new ConcurrentHashMap();
   m.put(101, "java");
   m.putIfAbsent(102, "vini");
   System.out.println(m);
   m.putIfAbsent(102, "shiva");
   System.out.println(m);
	}

}
