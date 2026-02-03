package Collections;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        System.out.println("Original List:");
        for(String s : list) {
            System.out.println(s);
        }

        list.remove("C++");
        list.add(1, "Spring");

        System.out.println("\nAfter Modification:");
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nSize: " + list.size());
        System.out.println("Contains Java? " + list.contains("Java"));
    }
}

