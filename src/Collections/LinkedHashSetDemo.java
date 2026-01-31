package Collections;

import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(5);
        set.add(1);
        set.add(3);
        set.add(5);

        System.out.println("LinkedHashSet:");
        set.forEach(System.out::println);

        System.out.println("Contains 3? " + set.contains(3));
        set.remove(1);

        System.out.println("\nAfter Removal:");
        set.forEach(System.out::println);
    }
}

