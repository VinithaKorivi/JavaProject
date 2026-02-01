package Collections;

import java.util.*;

public class CollectionsUtilityDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(1);
        list.add(3);

        Collections.sort(list);
        System.out.println("Sorted: " + list);

        Collections.reverse(list);
        System.out.println("Reversed: " + list);

        System.out.println("Max: " + Collections.max(list));
        System.out.println("Min: " + Collections.min(list));

        Collections.shuffle(list);
        System.out.println("Shuffled: " + list);
    }
}
