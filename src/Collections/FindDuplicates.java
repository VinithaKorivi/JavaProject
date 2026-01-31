package Collections;

import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(Integer i : list) {
            if(!set.add(i)) {
                duplicates.add(i);
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }
}
