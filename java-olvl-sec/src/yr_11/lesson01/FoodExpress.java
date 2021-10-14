package yr_11.lesson01;

import java.util.Scanner;

public class FoodExpress {

    /**
     * A method to display a simple food menu like you would see
     * in a kiosk.
     */
    public static void displayMenu() {
        // Declaring an **array** that will store our menu items of type String
        String[] kioskMenu = {"Fish and Chips", "Hot Dog and Chips", "Ftira", "Salad Tuna", "Salad Chicken", "Soft Drink"};

        // Display them using a for loop
        for(int i = 0; i < 6; i++) {
            // Display (using + as an operator to join text)
            System.out.println((i + 1) + ". " + kioskMenu[i]);
        }
    }

    /**
     * A method that should accept input from the user to display the order
     */
    public static void placeOrder() {
        // Prompt the user to place the order
        System.out.println("Kindly type in your order...");

        // Let's declare a variable to store what the customer wants
        String order = "";

        // Accepting input
        Scanner acceptInput = new Scanner(System.in);  
        order = acceptInput.nextLine();

        // Check that this works
        System.out.println(order);

        // Closing input
        acceptInput.close();
    }
}
