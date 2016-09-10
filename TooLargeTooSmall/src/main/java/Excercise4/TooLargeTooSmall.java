package Excercise4;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by abijah on 9/9/16.
 */
public class TooLargeTooSmall {

    public static void main(String[] args) {

        Random random = new Random();
        int number2Guess = random.nextInt(60);
        int numTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        int lastguess=0;
        boolean win = false;

        while (win == false) {

            System.out.println("Guess a  number between 1 and 60");

                guess = input.nextInt();
            if (guess != lastguess) {
                numTries++;
                lastguess = guess;

            if (guess == number2Guess) {
                win = true;
                System.out.println("You are a F'ing Psychic!");
            } else if (guess < number2Guess) {
                System.out.println("Your guess is too Low!");
            } else if (guess > number2Guess) {
                System.out.println("Your guess is too high!");
                }
            }
            else{
                System.out.println("You guessed the same number twice!");
            }
        }
        System.out.println("You Win!");
        System.out.println("The number was" + " "+ number2Guess);
        System.out.println("It took" + " " + numTries + " tries");
    }
}
