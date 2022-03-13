package yr_10.lesson10;

/**
 * Copy from here till the very end...
 */
import java.util.Scanner;

public class MenuDrivenProgram {

    public static void lesson() {
        // Creating object of Scanner class so that user can use keyboard
        Scanner sc = new Scanner(System.in);
        
        // Declare variable to store user's choice
        int choice;

        // Displaying the menu
        System.out.println("*** Welcome, use this program to calculate area of a shape! ***");
        System.out.println("1. Area of Right Angle Triangle");
        System.out.println("2: Area of Square");
        System.out.println("3: Area of Rectangle");
        // TODO: Try and add a fourth option for area. Get area ideas from the internet.
        System.out.println("5: Area of Circle");
        System.out.println("7: Quit");
        
        // Ask the user to make his/her choice and store it
        System.out.print("Please type in your choice: ");  
        choice = sc.nextInt();

        // Depending on the choice run the appropriate method
        switch (choice)
        {
            case 1: {
                // Guide the user to take appropriate steps
                System.out.println("Your choice is Area of Right Angle Triangle.");
                System.out.print("Enter height:");
                double height = sc.nextDouble();
                System.out.print("Enter breadth:");
                double breadth = sc.nextDouble();
                // Make the correct method call
                double area = calcAreaRightAngleTriange(height, breadth);
                // Display the result to the user
                System.out.print("The area of your right angle triange is: " + area);
                break;
            }
            case 2: {
                // Guide the user to take appropriate steps
                System.out.println("Your choice is Area of Square.");
                System.out.print("Enter width:");
                double width = sc.nextDouble();
                // Make the correct method call
                double area = calcAreaSquare(width);
                // Display the result to the user
                System.out.print("The area of your square is: " + area);
                break;
            }
            case 3: {
                // TODO: User flow for area of rectangle option
            }
            case 4: {
                // TODO: User flow for area of your choice
            }
            case 5: {
                // Guide the user to take appropriate steps
                System.out.println("Your choice is Area of Circle.");
                System.out.print("Enter radius:");
                double radius = sc.nextDouble();
                // Make the correct method call
                double area = calcAreaCircle(radius);
                // Display the result to the user
                System.out.print("The area of your circle is: " + area);
                break;
            }
            case 7: {
                System.out.println("You want to quit! You are no fun, bye bye!");
                break;
            }
            default: {
                System.out.println("There is something wrong with your choice. Please try again later.");
                break;
            }
        }
        sc.close();
    }

    /**
     * ------ All the methods the user can run in this program -------------------------------
     */

    /**
     * 
     * @return area of right angle triangle
     */
    public static double calcAreaRightAngleTriange(double h, double b) {
        double area = 0.0;
        area = (h*b)/2;
        return area;
    }

    /**
     * 
     * @return area of square
     */
    public static double calcAreaSquare(double w) {
        double area = 0.0;
        area = w*w;
        return area;
    }

    /**
     * 
     * @return area of rectangle
     */
    public static double calcAreaRectangle(double w, double h) {
        double area = 0.0;
        area = w*h;
        return area;
    }

    /**
     * 
     * @return area of circle
     */
    public static double calcAreaCircle(double r) {
        double area = 0.0;
        area = Math.PI*r*r;
        return area;
    }

    // TODO: Don't forget to create a method for your own option here!!
}
