import java.util.Random;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int score = 0;

        System.out.println("Welcome to the Number Game!");

        while (true) {
            int number = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 5;
            boolean guessed = false;

            System.out.println("\nGuess a number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Correct! You guessed in " + attempts + " attempts.");
                    score++;
                    guessed = true;
                    break;
                } else if (guess > number) {
                    System.out.println("Too High!");
                } else {
                    System.out.println("Too Low!");
                }
            }

            if (!guessed) {
                System.out.println("You lost! The number was: " + number);
            }

            System.out.print("Play again? (yes/no): ");
            String choice = sc.next();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Your total score: " + score);
        sc.close();
    }
}