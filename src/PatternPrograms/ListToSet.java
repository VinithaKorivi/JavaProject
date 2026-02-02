package PatternPrograms;

import java.util.*;
import java.util.stream.*;

public class ListToSet {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("A","B","A");

        Set<String> set = list.stream()
                .collect(Collectors.toSet());

        set.forEach(System.out::println);
    }
}
