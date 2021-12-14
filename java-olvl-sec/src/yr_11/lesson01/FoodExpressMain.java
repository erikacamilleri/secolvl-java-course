package yr_11.lesson01;

import java.util.Scanner;

import yr_11.lesson02.ArrayHelpers;

public class FoodExpressMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*******************************************");
        System.out.println("*** Welcome, to Food Express Kiosk App. ***");
        System.out.println("*******************************************");
        FoodExpress.displayMenu();
        System.out.println("\nPress q to quit the app.");

        System.out.println("Would you like to start a new order? (y)");

        char option = sc.next().charAt(0);
        
        boolean isOrderReady = false;

        while (option != 'q' && !isOrderReady) {
            System.out.println("What food item would you like to add to your order?");
            int foodCode = sc.nextInt();

            // Special Feature: Linear Search
            int index = ArrayHelpers.linearSearch(FoodExpress.foodCodes, foodCode);

            // Special Feature: Validation
            while (foodCode != 81 && index == -1) {
                System.out.println("The food code you entered is invalid, please enter a food code (q to quit).");
                foodCode = sc.nextInt();
            }

            // Special Feature: Verification (in case the user hit q by mistake)
            if (foodCode == 81) {
                System.out.println("It seems like you have an order in progress... you sure you want to quit? (y, n)");
                char verification = sc.next().charAt(0);
                if (verification == 'y') {
                    option = 'q';
                }
            } else {
                FoodExpress.addFoodItemToCart(foodCode);
                System.out.println("Anything else to add? (y, n, q)");
                option = sc.next().charAt(0);
                if (option == 'n') {
                    isOrderReady = true;
                }
            }
        }

        if (option == 'q') {
            System.out.println("Looks like you don't want to proceed. Sad to see you leave. We will be happy to assist you in the future.");
            System.out.println("Here is a coupon code for next time: ");
            System.out.println("Bye!");
        }

        if (isOrderReady) {
            FoodExpress.displayCart();
            // TODO Generate Unique Code
            System.out.println("We are preparing your order now... here is your code. We will call you when it is ready.");
        }

        sc.close();
    }
}
