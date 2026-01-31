package Collections;

import java.util.concurrent.*;

public class FailSafeDemo {
    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> list =
                new CopyOnWriteArrayList<>();

        list.add(10);
        list.add(20);

        for(Integer i : list) {
            list.add(30); // No exception
            System.out.println(i);
        }
    }
}
