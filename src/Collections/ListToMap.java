package Collections;

import java.util.*;

public class ListToMap {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("A","B","C");
        Map<Integer,String> map = new HashMap<>();

        int i = 1;
        for(String s : list) {
            map.put(i++, s);
        }

        map.forEach((k,v) -> 
            System.out.println(k + " -> " + v)
        );
    }
}
