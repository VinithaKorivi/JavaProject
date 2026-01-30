package Collections;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Java");
        map.put(102, "Python");
        map.put(103, "C++");

        for(Map.Entry<Integer,String> e : map.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        map.remove(102);

        System.out.println("\nAfter Removal:");
        map.forEach((k,v) -> System.out.println(k + " = " + v));

        System.out.println("Contains Key 101? " + map.containsKey(101));
    }
}
