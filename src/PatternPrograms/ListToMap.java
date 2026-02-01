package PatternPrograms;

import java.util.*;
import java.util.stream.*;

public class ListToMap {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java","Python");

        Map<Integer,String> map =
                IntStream.range(0, list.size())
                        .boxed()
                        .collect(Collectors.toMap(
                                i -> i,
                                list::get
                        ));

        map.forEach((k,v)->System.out.println(k+" "+v));
    }
}
