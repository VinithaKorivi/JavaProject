package OOPS;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + " = " + arr[i]);
        }

        System.out.println("Length = " + arr.length);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}
