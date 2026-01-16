package OOPExPrograms;

class Printer {
    void print(int num) {
        System.out.println("Printing int: " + num);
    }

    void print(double num) {
        System.out.println("Printing double: " + num);
    }

    void print(String text) {
        System.out.println("Printing text: " + text);
    }

    void print(int[] arr) {
        System.out.print("Array: ");
        for(int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}

public class Test5 {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(10);
        p.print(45.66);
        p.print("Hello Java");
        p.print(new int[]{1,2,3,4,5});
    }
}
