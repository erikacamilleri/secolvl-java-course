package yr_11.lesson01;

public class FoodExpress {

    public static double cartTotal = 0.00;

    /**
     * Special Feature: We are using a technique called parrallel arrays to organise our food menu
     */
    public static double[] prices = {6.00, 6.00, 4.00, 12.00, 12.00, 3.95};
    
    public static String[] kioskMenu = {"Fish and Chips", "Hot Dog and Chips", "Ftira", "Salad Tuna", "Salad Chicken", "Soft Drink"};
    
    public static int[] foodCodes = {1, 2, 3, 4, 5, 6};

    private static int[] cartQty = {0, 0, 0, 0, 0, 0};
    
    /**
     * A method to display a simple food menu like you would see
     * in a kiosk.
     */
    public static void displayMenu() {
        // Display them using a for loop
        for(int i = 0; i < 6; i++) {
            // Display (using + as an operator to join text)
            System.out.println(foodCodes[i] + ". " + kioskMenu[i] + " ($" +  String.format("%.02f", prices[i]) + ")");
        }
    }

    public static void addFoodItemToCart(int foodCode) {
        // Searching for the food code
        for(int i = 0; i < 6; i++) {
            if (foodCodes[i] == foodCode) {
                // We add the food item to cart
                FoodExpress.cartTotal = FoodExpress.cartTotal + prices[i];
                FoodExpress.cartQty[i]++;
            }
        }

        System.out.println("The cart got updated: $" + String.format("%.02f", cartTotal));
    }

    public static void displayCart() {
        for(int i = 0; i < 6; i++) {
            if (cartQty[i] > 0) {
                System.out.println(kioskMenu[i] + " @ $" +  String.format("%.02f", prices[i]) + "    Qty: " + cartQty[i]);
            }
        }
        System.out.println("Total: " +  String.format("%.02f", cartTotal));
    }
}
