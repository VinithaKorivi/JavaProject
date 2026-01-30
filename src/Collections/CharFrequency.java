package Collections;

import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {

        String s = "interview";
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        map.forEach((k,v) -> 
            System.out.println(k + " = " + v)
        );
    }
}
