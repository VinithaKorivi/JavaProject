package PatternPrograms;

import java.util.*;
import java.util.stream.*;

public class SortNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5,2,8,1);

        list.stream()
            .sorted()
            .forEach(System.out::println);
    }
}
