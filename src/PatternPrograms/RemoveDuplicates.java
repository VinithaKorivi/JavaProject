package PatternPrograms;

import java.util.*;
import java.util.stream.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,2,3,3,4);

        List<Integer> unique = list.stream()
                .distinct()
                .collect(Collectors.toList());

        unique.forEach(System.out::println);
    }
}

