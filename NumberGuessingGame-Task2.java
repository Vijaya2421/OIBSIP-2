import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random rand = new Random();
            int numberToGuess = rand.nextInt(100) + 1;
            int numberOfTries = 0;
            int guess;
            boolean win = false;
            
            System.out.println("Welcome to the number guessing game!");
            System.out.println("i have selected a number between 1 to 100");
            System.out.println("Guess a number between 1 and 100:");
            System.out.println("Can you guess what it is?");
            
            while (!win) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                numberOfTries++;
                
                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                } else if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    win = true;
                    System.out.println("Congratulations! You've guessed the right number.");
                    System.out.println("It took you " + numberOfTries + " tries.");
                }
            }
        }
    }
}

        