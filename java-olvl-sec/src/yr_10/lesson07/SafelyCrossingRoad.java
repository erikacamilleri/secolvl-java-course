package yr_10.lesson07;

import java.util.Scanner;

/**
 * Question 4 
 */
public class SafelyCrossingRoad {
    
    public static void lesson() {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Do something to stop at the kerb");
        
        boolean isRoadClear = false;

        do {
            System.out.println("Do something to look left and right");
            System.out.println("Is the road clear?");
            isRoadClear = sc.nextBoolean();
        } while (!isRoadClear);

        System.out.println("You can cross safely");

        sc.close();
    }
}