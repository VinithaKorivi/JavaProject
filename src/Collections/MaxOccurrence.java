package Collections;

import java.util.*;

public class MaxOccurrence {
    public static void main(String[] args) {

        int[] arr = {1,2,2,3,3,3};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int maxKey = 0, maxVal = 0;

        for(Map.Entry<Integer,Integer> e : map.entrySet()) {
            if(e.getValue() > maxVal) {
                maxVal = e.getValue();
                maxKey = e.getKey();
            }
        }

        System.out.println("Max occurring: " + maxKey);
    }
}
