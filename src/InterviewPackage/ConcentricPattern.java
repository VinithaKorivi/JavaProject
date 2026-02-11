package InterviewPackage;

public class ConcentricPattern {
    public static void main(String[] args) {
        int n = 4;
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int min = Math.min(
                        Math.min(i, j),
                        Math.min(size - i - 1, size - j - 1)
                );
                System.out.print((n - min) + " ");
            }
            System.out.println();
        }
    }
}

