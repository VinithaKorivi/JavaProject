package OOPS;

import java.util.*;

public class Ex5 {
    public static void main(String[] args) {
        int[] a = {5, 1, 9, 2, 7};

        System.out.println("Before Sort:");
        for(int x : a) System.out.println(x);

        Arrays.sort(a);

        System.out.println("After Sort:");
        for(int x : a) System.out.println(x);
    }
}
