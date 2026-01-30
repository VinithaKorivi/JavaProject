package PatternPrograms;

import java.util.*;
import java.util.stream.*;

public class CountElements {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("A","B","C","D");

        long count = list.stream()
                .count();

        System.out.println("Total Elements: " + count);
    }
}

