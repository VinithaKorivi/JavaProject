package Collections;

import java.util.*;

public class FailFastDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()) {
            list.add(30); // Exception
            System.out.println(it.next());
        }
    }
}
