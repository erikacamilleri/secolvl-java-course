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
            if (guess < number) {
                System.out.println("You are not correct! The number I am thinking of, is bigger. Take another guess...");
            } else {
                System.out.println("You are not correct! The number I am thinking of, is smaller. Take another guess...");
            }
            // Make the user take another guess
            guess = sc.nextInt();
        }
        System.out.println("Congratulations, you guessed the number!");

        // Exercise 2 - Guess the number second round, but the user only has three tries!
        // Explain that you are playing guess the number, but tell the user they only have 3 tries
        System.out.println("Let's have another round. But this time, I will only give you three chances!");
        // Copy the piece of code that gets a random number (you can pause afterward to make it seem like the computer is thinking...)
        // This piece of codes gives a random number
        int number2 = (new Random()).nextInt(10);
        // Make the program take a break
        pause(5);
        int tries = 1;
        // Ask user for first guess
        System.out.println("Take your first guess...");
        guess = sc.nextInt();
        // While the user did not guess **and** tries is less than 3, keep asking for a guess
        while(guess != number2 && tries <= 3) {
            if (guess < number) {
                System.out.println("You are not correct! The number I am thinking of, is bigger. Take another guess...");
            } else {
                System.out.println("You are not correct! The number I am thinking of, is smaller. Take another guess...");
            }
            // Make the user take another guess
            guess = sc.nextInt();
            tries = tries + 1;
        }
        if (tries == 3 && guess == number) {
            System.out.println("You guessed! Well done!");
        }
        if (tries == 3 && guess != number) {
            System.out.println("You lost! The number I thought of was... " + number2);
        }

        // Let's practice how to write a do...while loop
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 2);

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
        Scanner sc = new Scanner(System.in);
        boolean isSongFinished = false;
        // Do the steps for wash hands, between each step pause the program for 3 seconds
        do {
            System.out.println("Rub hands palm to palm");
            pause(3);
            System.out.println("Palm to palm with fingers interlaced");
            for (int h = 1; h <=2; h++) {
                if (h == 1) {
                    // left hand
                    System.out.println("Rub palm againt left fingertips and under nails");
                } else {
                    // right hand
                    System.out.println("Rub palm againt right fingertips and under nails");
                }
                pause(3);
            }
            System.out.println("Rub in between the fingers");
            pause(3);
            // After all the steps, ask the user if they stopped singing happy birthday twice
            System.out.println("Did you sing happy birthday twice?");
            char ans = sc.next().charAt(0);
            if (ans == 'y') {
                isSongFinished = true;
            }
        } while (!isSongFinished); // Repeat until user stops singing...   
        sc.close();     
    }
}
