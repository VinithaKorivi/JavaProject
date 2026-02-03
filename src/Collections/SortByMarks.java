package Collections;

import java.util.*;

class Student6 {
    int marks;
    String name;

    Student6(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
}

public class SortByMarks {
    public static void main(String[] args) {

        ArrayList<Student6> list = new ArrayList<>();
        list.add(new Student6(85,"A"));
        list.add(new Student6(65,"B"));
        list.add(new Student6(95,"C"));

        Collections.sort(list,
            (s1,s2) -> s1.marks - s2.marks
        );

        list.forEach(s ->
            System.out.println(s.name + " " + s.marks)
        );
    }
}
