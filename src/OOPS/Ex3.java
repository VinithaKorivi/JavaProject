package OOPS;

public class Ex3 {
    public static void main(String[] args) {
        int[] marks = new int[5];

        marks[0] = 88;
        marks[1] = 76;
        marks[2] = 90;
        marks[3] = 95;
        marks[4] = 82;

        int total = 0;

        for(int m : marks) {
            System.out.println("Marks: " + m);
            total += m;
        }

        System.out.println("Total = " + total);
    }
}
