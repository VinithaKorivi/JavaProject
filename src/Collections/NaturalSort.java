package Collections;

import java.util.*;

public class NaturalSort {

	public static void main(String[] args) {
		  Employee e1=new Employee("Vini",100);
		    Employee e2=new Employee("Bala",101);
		    Employee e3=new Employee("kavya",304);
		    Employee e4=new Employee("Narayan",600);
		    Employee e5=new Employee("Harshitha",30);
//		    Employee e1=new Employee("Vini",100);
		    TreeSet t=new TreeSet();
			t.add(e1);
			t.add(e2);
			t.add(e3);
			t.add(e4);
			t.add(e5);
			System.out.println(t);
			System.out.println("..............");
		
	} 

}
