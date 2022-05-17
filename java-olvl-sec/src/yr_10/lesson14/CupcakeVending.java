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

        // Display the price
        System.out.println("Price: " + (PRICE * quantityIn));
    }

}
