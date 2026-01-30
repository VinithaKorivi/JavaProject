package PatternPrograms;

import java.util.*;
import java.util.stream.*;

public class EvenNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,15,20,25,30);

        List<Integer> evens = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers:");
        evens.forEach(System.out::println);
    }
}

