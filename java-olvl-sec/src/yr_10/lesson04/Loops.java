package yr_10.lesson04;

import java.util.Scanner;

public class Loops {
    /**
     * Today, we are going to learn about for loops!
     */
    public static void lesson() {
        // TODO Draw a square of stars using a for loop
        System.out.println("Let's draw a rectangle using a for loop.");
        for(int i = 1; i <= 3; i++) {
            System.out.println("* * * * *");
        }

        // TODO Print out all the numbers between 1 and 10
        System.out.println("Printing out all the numbers between 1 and 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // TODO Print out the three times table, and for each one print out a line of stars!
        System.out.println("Let us do the three times table...");
        for (int i = 1; i <= 12; i++) {
            int timesRow = 3 * i;
            System.out.println(i + " x 3 = " + timesRow);
        }
    }

    /**
     * Make the user input 3 numbers and output the highest number.
     */
    public static void challenge() {
        int highestNumber = -1; // you can assign any value here, won't make a difference
        // Do not forget to import java.util.Scanner; at the very top!
        Scanner sc = new Scanner(System.in);
        for(int i= 1; i <=3; i++) {
            System.out.println("Throw me a number...");
            int numberIn = sc.nextInt();
            // Smart Trick: if it is the first number then update highest number
            if (i == 1 || numberIn > highestNumber) {
                highestNumber = numberIn;
            }
        } 
        sc.close();
        System.out.println("The highest number is " + highestNumber);
    }
}
