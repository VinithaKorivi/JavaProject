package ACollections;
import java.util.concurrent.ConcurrentHashMap;
public class ConCurrMapMeth2 {

	public static void main(String[] args) {
		ConcurrentHashMap v=new ConcurrentHashMap();
		v.put(101, "bavya");
		v.remove(101, "shiva");
		System.out.println(v);
		v.remove(101, "bavya");
		System.out.println(v);
		v.put(101, "durga");
		System.out.println(v);
		v.replace(101, "durga", "vini");
		System.out.println(v);
	}

}
