package OOPS;

public class Ex7 {
    public static void main(String[] args) {
        int[][] jag = {
            {1, 2},
            {3, 4, 5},
            {6}
        };

        for(int[] row : jag) {
            for(int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
