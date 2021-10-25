package yr_10.lesson02;

import java.util.Scanner;

public class BasicLogicRefresher {
    /**
     * We are considering an example of a shop that is selling numerous items.
     * However, we want to make sure that if people are underage certain items
     * are not sold! We must make sure that the programs we write are ethical
     * and do not break the law.
     */
    public static void lesson() {
        // Initialise the Scanner object so that we can accept input from the keyboard by the user
        Scanner sc = new Scanner(System.in);

        // Declare a variable of type integer to store the user's age
        int age;

        // Displaying a message to the user to ask his/her age
        System.out.println("Please tell us how old you are...");

        // The user input is immediately stored in the variable
        age = sc.nextInt();

        // The program here makes a decision based on the user input
        // If the user is greater than or equal to 18 no items need to be hidden
        if (age >= 18) {
            // Show all items
            System.out.println("Show all items.");
        } else {
            // Remove alcoholic items
            System.out.println("Remove alcoholic items.");
        }

        // Good practice to close our resources
        sc.close();
    }
}
