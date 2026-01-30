package Collections;

import java.util.*;

class Emp {
    int salary;
    String name;

    Emp(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {

        ArrayList<Emp> list = new ArrayList<>();
        list.add(new Emp(30000,"A"));
        list.add(new Emp(20000,"B"));
        list.add(new Emp(40000,"C"));

        Collections.sort(list, (e1, e2) -> e1.salary - e2.salary);

        for(Emp e : list) {
            System.out.println(e.name + " " + e.salary);
        }
    }
}
