package yr_10.lesson06;

import java.util.Scanner;

public class SantaParcelDelivery {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double w, l, b, h = 0;

        System.out.println("Enter the weight: ");
        w = sc.nextDouble();

        System.out.println("Enter the length: ");
        l = sc.nextDouble();

        System.out.println("Enter the breadth: ");
        b = sc.nextDouble();

        System.out.println("Enter the height: ");
        h = sc.nextDouble();

        double dimensions = l + b + h;

        if (dimensions > 300 || w < 1 || w > 10 || l > 100 || b > 100 || h > 100) {
            System.out.println("Sorry, the parcel is invalid!");
        } else {
            System.out.println("We can deliver this parcel!");
        }

        sc.close();
    }
}
