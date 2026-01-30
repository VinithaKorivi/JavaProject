package Collections;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);

        System.out.println("Sorted TreeSet:");
        for(int n : set) {
            System.out.println(n);
        }

        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());

        set.remove(30);
        System.out.println("After Removal: " + set);
    }
}

