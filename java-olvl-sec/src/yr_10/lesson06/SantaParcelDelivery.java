package yr_10.lesson06;

import java.util.Scanner;

/**
 * I am a runnable class because I have the main method declared.
 */
public class SantaParcelDelivery {
    public static void main(String[] args) {

        // Welcome message
        System.out.println("*** Santa Parcel Delivery Helper ***");
        System.out.println("");

        // We need to use the keyboard
        Scanner sc = new Scanner(System.in);

        /**
         * Check multiple parcels and count how many are invalid.
         */
        System.out.println("How many parcels would you like to check just now?");
        int parcels = sc.nextInt();
        int validParcels = 0; // to keep track of how many parcels are valid
        double totalCandyCanes = 0; // keeping track of the candy canes required (hard)

        for (int count = 1; count <= parcels; count++) {

            System.out.println("Please provide details for parcel " + count);
            
            /**
             * All the code in this for loop is for the EASY task...
             * Checking each parcel
             */
            double w, l, b, h = 0;

            // Ask user to enter parcel details
            System.out.println("Enter the weight: ");
            w = sc.nextDouble();

            System.out.println("Enter the length: ");
            l = sc.nextDouble();

            System.out.println("Enter the breadth: ");
            b = sc.nextDouble();

            System.out.println("Enter the height: ");
            h = sc.nextDouble();

            // Calculate the dimensions
            double dimensions = l + b + h;

            // Check if the parcel is valid or not
            if (dimensions > 300 || w < 1 || w > 10 || l > 100 || b > 100 || h > 100) {
                System.out.println("Sorry, the parcel is invalid!");
                
                // Output all the reasons why (medium)
                if (dimensions > 300) {
                    System.out.println("The parcel's dimensions is greater than 300.");
                }              
                if (w < 1 || w > 10) {
                    System.out.println("The parcel's weight is not between 1kg and 10kg.");
                } 
                if (l > 100 || b > 100 || h > 100) {
                    System.out.println("The length, breadth or height is greater than 100.");
                }
            } else {
                System.out.println("We can deliver this parcel!");
                validParcels = validParcels + 1; // Keep track of how many parcels are valid (running total)
                
                /**
                 * Hard calculating the candy canes...
                 */
                if (w <= 5) {
                    // Standard rate applies
                    totalCandyCanes = totalCandyCanes + 10;
                } else {
                    double extraWeight = 10 - w;
                    totalCandyCanes = totalCandyCanes + 10.00 + ((extraWeight * 1000.00)/100.00); 
                }
            }
        }

        // Output number of parcels accepted and rejected
        System.out.println("Acceptable to deliver on sleigh: " + validParcels);
        System.out.println("Parcels that do not meet requirements: " + (parcels - validParcels));

        // Output number of candy canes required to fuel deliveries
        System.out.println("To deliver these parcels Santa needs: " + totalCandyCanes + " candy canes");

        sc.close();
    }
}
