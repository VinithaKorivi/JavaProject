package Collections;

import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        map.forEach((k,v) -> System.out.println(k + " -> " + v));

        map.remove("B");

        System.out.println("\nAfter Removal:");
        map.forEach((k,v) -> System.out.println(k + " -> " + v));
    }
}
