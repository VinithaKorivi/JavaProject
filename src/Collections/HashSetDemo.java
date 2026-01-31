package Collections;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        set.add("Orange");

        System.out.println("HashSet Elements:");
        for(String s : set) {
            System.out.println(s);
        }

        set.remove("Banana");

        System.out.println("\nAfter Removal:");
        set.forEach(System.out::println);

        System.out.println("Size: " + set.size());
    }
}

