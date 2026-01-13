package OOPS;

public class Ex8 {
    static void display(int[] arr) {
        for(int x : arr) {
            System.out.println("Value: " + x);
        }
    }

    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40};
        display(data);
    }
}
