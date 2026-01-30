package Collections;

import java.util.*;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        System.out.println("Top Element: " + stack.peek());

        stack.pop();

        System.out.println("After Pop:");
        for(Integer i : stack) {
            System.out.println(i);
        }

        System.out.println("Is Empty? " + stack.isEmpty());
    }
}

