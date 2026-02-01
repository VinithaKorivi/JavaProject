package FebPrograms;
import java.lang.reflect.*;
public class GetClass {

	public static void main(String[] args) {
     int count = 0;
     Object t=new String("nandu");
     Class c=t.getClass();
     System.out.println("fully qualified name of class is "+c.getName());
     Method[] a=c.getDeclaredMethods();
     System.out.println("Method information");
     for(Method m:a) {
    	 count++;
    	 System.out.println(m.getName());
     }
     System.out.println("The no of methods  "+count);
	}

}
