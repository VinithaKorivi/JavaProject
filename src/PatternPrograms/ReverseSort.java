package PatternPrograms;

import java.util.*;
import java.util.stream.*;

public class ReverseSort {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5,2,8,1);

        list.stream()
            .sorted(Comparator.reverseOrder())
            .forEach(System.out::println);
    }
}

