package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExa {

	public static void main(String[] args) {
		  Vector<String> v = new Vector<>();

	        v.add("One");
	        v.add("Two");
	        v.add("Three");
	        v.add("Four");
	        v.add("Five");
	        v.add("Six");
	        v.add("Seven");

	        Enumeration<String> e = v.elements();

	        System.out.println("Vector Elements:");
	        while(e.hasMoreElements()) {
	            System.out.println(e.nextElement());
	        }

	        v.remove("Two");

	        System.out.println("\nAfter Removal:");
	        for(String s : v) {
	            System.out.println(s);
	        }

	        System.out.println("Capacity: " + v.capacity());
	    }
	}


