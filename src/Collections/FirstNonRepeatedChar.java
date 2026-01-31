package Collections;

import java.util.*;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {

        String s = "swiss";
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character,Integer> e : map.entrySet()) {
            if(e.getValue() == 1) {
                System.out.println("First non-repeated: " + e.getKey());
                break;
            }
        }
    }
}

