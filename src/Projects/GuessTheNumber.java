package Projects;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        int rounds = 3;   // number of rounds

        for (int round = 1; round <= rounds; round++) {

            System.out.println("\n🎯 Round " + round);
            int numberToGuess = random.nextInt(100) + 1; // 1 to 100
            int attempts = 5;  // max attempts
            boolean guessedCorrectly = false;

            for (int i = 1; i <= attempts; i++) {

                System.out.print("Enter your guess (1-100): ");
                int userGuess = sc.nextInt();

                if (userGuess == numberToGuess) {
                    System.out.println("✅ Correct! You guessed it in " + i + " attempts.");
                    totalScore += (attempts - i + 1) * 10; // scoring formula
                    guessedCorrectly = true;
                    break;
                }
                else if (userGuess > numberToGuess) {
                    System.out.println("📉 Too High!");
                }
                else {
                    System.out.println("📈 Too Low!");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("❌ You lost! The correct number was: " + numberToGuess);
            }
        }

        System.out.println("\n🏆 Game Over!");
        System.out.println("Your Total Score: " + totalScore);

        sc.close();
    }
}