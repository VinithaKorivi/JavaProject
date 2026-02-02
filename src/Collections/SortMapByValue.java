package Collections;

import java.util.*;

public class SortMapByValue {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();
        map.put("A", 30);
        map.put("B", 10);
        map.put("C", 20);

        List<Map.Entry<String,Integer>> list =
                new ArrayList<>(map.entrySet());

        list.sort((e1,e2) -> e1.getValue() - e2.getValue());

        list.forEach(e ->
            System.out.println(e.getKey() + " " + e.getValue())
        );
    }
}

