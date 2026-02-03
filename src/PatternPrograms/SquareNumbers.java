package PatternPrograms;

import java.util.*;
import java.util.stream.*;

public class SquareNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);

        List<Integer> squares = list.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        squares.forEach(System.out::println);
    }
}

