import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        Random gen = new Random();


        int targetNumber = gen.nextInt(10) + 1;
        int userGuess = 0;
        boolean isValid;
        String trash;


        do {
            isValid = false;
            System.out.print("Guess a number between 1 and 10 inclusive: ");

            if (pipe.hasNextInt()) {
                userGuess = pipe.nextInt();
                pipe.nextLine();


                if (userGuess >= 1 && userGuess <= 10) {
                    isValid = true;
                } else {
                    System.out.println("Error: Your guess (" + userGuess + ") must be from 1 to 10.\n");
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("Error: '" + trash + "' is not a valid integer.\n");
            }
        } while (!isValid);


        System.out.println("\nThe computer's random number was: " + targetNumber);


        if (userGuess == targetNumber) {
            System.out.println("You are right on the money!");
        } else if (userGuess > targetNumber) {
            System.out.println("Your guess was too high!");
        } else {
            System.out.println("Your guess was too low!");
        }
    }
}

