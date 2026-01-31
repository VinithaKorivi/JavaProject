package Collections;

import java.util.*;

public class LinkedlistDemo {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.addFirst(5);
        list.addLast(40);

        System.out.println("LinkedList Elements:");
        for(int n : list) {
            System.out.println(n);
        }

        list.removeFirst();
        list.removeLast();

        System.out.println("\nAfter Removal:");
        list.forEach(System.out::println);

        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
    }
}
