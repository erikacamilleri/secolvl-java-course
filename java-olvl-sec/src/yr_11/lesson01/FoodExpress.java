package yr_11.lesson01;

import java.util.Scanner;

public class FoodExpress {

    public static double cartTotal = 0.00;

    /**
     * We are using a technique called parrallel arrays to organise our food menu
     */
    public static double[] prices = {6.00, 6.00, 4.00, 12.00, 12.00, 3.95};
    
    public static String[] kioskMenu = {"Fish and Chips", "Hot Dog and Chips", "Ftira", "Salad Tuna", "Salad Chicken", "Soft Drink"};
    
    public static int[] foodCodes = {1, 2, 3, 4, 5, 6};
    
    /**
     * A method to display a simple food menu like you would see
     * in a kiosk.
     */
    public static void displayMenu() {
        // Display them using a for loop
        for(int i = 0; i < 6; i++) {
            // Display (using + as an operator to join text)
            System.out.println((i + 1) + ". " + kioskMenu[i]);
        }
    }

    public static void addFoodItemToCart(int foodCode) {
        // E.g. 1
        // Searching for the food code
        for(int i = 0; i < 6; i++) {
            if (foodCodes[i] == foodCode) {
                // We add the food item to cart
                FoodExpress.cartTotal = FoodExpress.cartTotal + prices[i];
            }
        }

        System.out.println("The cart got updated: $" + FoodExpress.cartTotal);
    }

    /**
     * A method that should accept input from the user to display the order
     */
    public static int placeOrder() {
        // Prompt the user to place the order
        System.out.println("Kindly type in your order...");

        // Let's declare a variable to store what the customer wants
        int foodCode;

        // Accepting input
        Scanner acceptInput = new Scanner(System.in);  
        foodCode = acceptInput.nextInt();

        // Closing input
        acceptInput.close();

        // return what the user ordered
        return foodCode;
    }
}
