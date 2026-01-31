package PatternPrograms;

import java.util.*;
import java.util.stream.*;

public class MaxMin {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,50,30);

        int max = list.stream()
                .max(Integer::compare)
                .get();

        int min = list.stream()
                .min(Integer::compare)
                .get();

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
