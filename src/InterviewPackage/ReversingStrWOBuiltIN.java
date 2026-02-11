package InterviewPackage;
import java.util.Scanner;

public class ReversingStrWOBuiltIN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String reversed = "";

        // Loop from last character to first
        for (int i = input.length() - 1; i >= 0; i--) {

            reversed = reversed + input.charAt(i);
        }

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);

        sc.close();
    }
}
