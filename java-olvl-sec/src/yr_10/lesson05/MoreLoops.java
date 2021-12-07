package yr_10.lesson05;

// Students need to copy from here...
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MoreLoops {
    public static void lesson() {
        // Remember we need this to input from the keyboard
        Scanner sc = new Scanner(System.in);

        // Exercise 1 - Guess the number
        System.out.println("Let's play guess the number... let me think of a number first...");
        // This piece of codes gives a random number
        int number = (new Random()).nextInt(10);
        // Make the program take a break
        pause(5);
        System.out.println("Ok done! Have a go at your first guess!");
        int guess = sc.nextInt();
        // Using while, keep asking for a guess until guess == number
        while (guess != number) {
            // TODO Make the user take another guess
        }

        // Exercise 2 - Guess the number second round, but the user only has three tries!
        // TODO Explain that you are playing guess the number, but tell the user they only have 3 tries
        // TODO Copy the piece of code that gets a random number (you can pause afterward to make it seem like the computer is thinking...)
        // TODO Declare a variable to count the tries
        // TODO Ask user for first guess
        // TODO While the user did not guess **and** tries is less than 3, keep asking for a guess
        // TODO Keep track of whether the user guessed or not, and state the number the computer came up with

        // We are good developers, that take care of resources <3
        sc.close();
    }

    // You do not need to understand this for now ;)
    // We will do this (much, much) later!
    // For now just know that it is a piece of code that makes a program take a break... ahhhh
    private static void pause(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }

    /**
     * Do While Loop Challenge
     * An algorithm to wash our hands
     * Wash our hands until we sing happy birthday twice...
     */
    public static void challenge() {
        boolean isSongFinished = false;
        // TODO Do the steps for wash hands, between each step pause the program for 3 seconds
        // TODO After all the steps, ask the user if they stopped singing happy birthday twice
        // TODO Repeat until user stops singing...
    }
}
