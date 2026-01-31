package Collections;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> it = list.iterator();

        while(it.hasNext()) {
            String s = it.next();
            if(s.equals("B")) {
                it.remove();
            }
        }

        System.out.println("After Iterator Removal:");
        list.forEach(System.out::println);
    }
}
