package OOPS;

public class Ex4 {
    public static void main(String[] args) {
        int[] a = {45, 90, 12, 66, 78};

        int max = a[0];

        for(int i = 1; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("Max Value = " + max);
    }
}

