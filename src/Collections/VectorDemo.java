package Collections;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("One");
        v.add("Two");
        v.add("Three");

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
