package PatternPrograms;

import java.util.*;
import java.util.stream.*;

public class SecondHighest {
    public static void main(String[] args) {

        List<Integer> list =
            Arrays.asList(10,20,30,40);

        int secondMax = list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second Highest: " + secondMax);
    }
}
