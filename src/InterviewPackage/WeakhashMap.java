package InterviewPackage;
import java.util.*;
public class WeakhashMap {

	public static void main(String[] args) throws Exception{
//		WeakHashMap m=new WeakHashMap();
       HashMap m=new HashMap();
        Test t=new Test();
        m.put(t, "Vinitha");
        System.out.println(m);
        t=null;
        System.gc();
        Thread.sleep(2000);
        System.out.println(m);
	}

}
class Test{
	public String toString() {
		return "test";
	}
	public void finalize() {
		System.out.println("Finalize method is called");
	}
}