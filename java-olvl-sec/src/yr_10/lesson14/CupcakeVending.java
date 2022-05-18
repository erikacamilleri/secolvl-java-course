package yr_10.lesson14;

import java.util.Scanner;

public class CupcakeVending {

    static final int FLAVOUR_VANILLA = 1;
    static final int FLAVOUR_CHOCOLATE = 2;
    static final int FLAVOUR_BLUEBERRY = 3;
    static final int FLAVOUR_LEMON = 4;

    static final double PRICE = 1.50;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Prompt the user to select cupcake flavour
        System.out.println("Pick a flavour");
        int flavourIn = sc.nextInt();

        // Prompt the user to select cupcake quantity
        System.out.println("Enter quantity");
        int quantityIn = sc.nextInt();

        // Display the price, if quantityIn is 3, get one for free
        double totalPrice = 0;
        totalPrice = PRICE * quantityIn;
        if (quantityIn == 3) {
            // apply discount
            totalPrice = totalPrice - PRICE;
        }
        System.out.println("Price: " + totalPrice);

        // The part where the user puts in money
        double moneyIn = 0;
        double total = 0;
        do {
            System.out.println("Keep paying...");
            moneyIn = sc.nextDouble();
            total = total + moneyIn;
        } while (total >= totalPrice);

        // If the customer over paid for the cupcakes give change
        if (moneyIn > totalPrice) {
            double change = moneyIn - totalPrice;
            System.out.println("Here is your change: " + change);
        }

        // Drop the cupcake(s)
        switch (flavourIn) {
            case FLAVOUR_VANILLA: {
                break;
            }
            // TODO: Other Cases
        }

        // TODO Print Receipt

        // We are good developers, we give resources back!
        sc.close();
    }
}
