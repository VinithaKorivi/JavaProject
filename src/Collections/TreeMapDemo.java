package Collections;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "Three");
        map.put(1, "One");
        map.put(2, "Two");

        map.forEach((k,v) -> System.out.println(k + " = " + v));

        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());
    }
}
