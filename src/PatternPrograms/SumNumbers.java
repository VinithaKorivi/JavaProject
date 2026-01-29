package PatternPrograms;

import java.util.*;
import java.util.stream.*;

public class SumNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);

        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum: " + sum);
    }
}
