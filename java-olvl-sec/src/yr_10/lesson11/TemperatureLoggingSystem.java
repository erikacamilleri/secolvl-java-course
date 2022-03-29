package yr_10.lesson11;

import java.util.Scanner;

public class TemperatureLoggingSystem {
    
    public static void main(String[] args) {
        // Creating object of Scanner class so that user can use keyboard
        Scanner sc = new Scanner(System.in);
        
        // Declare variable to store user's choice
        int choice = 0;

        do {
            // Displaying the menu
            System.out.println("*** Welcome, use this program to log the temperatures of last week! ***");
            System.out.println("1. Log temperatures of last week.");
            System.out.println("2: Display all the temperatures entered.");
            System.out.println("3: Find the coldest day.");
            System.out.println("4: Find the warmest day.");
            System.out.println("5: Calculate the average temperature.");
            System.out.println("7: Quit");

            // Ask the user to make his/her choice and store it
            System.out.print("Please type in your choice: ");  
            choice = sc.nextInt();

            // Declare an array to store the temperatures of last week
            double[] temperatures = new double[7]; // 7 because 7 days of the week

            // Depending on the choice run the appropriate method
            switch (choice)
            {   
                case 1: {
                    // Guide the user to take appropriate steps
                    System.out.println("Your choice is: Log temperatures of last week.");
                    // TODO: Use a for loop to allow the user to insert double values in the temperatures array
                    break;
                }
                case 2: {
                    // Guide the user to take appropriate steps
                    System.out.println("Your choice is: Display all the temperatures entered.");
                    // TODO: call method displayTempatures() and pass in the temperatures array
                    break;
                }
                case 3: {
                    // TODO: Display a message to the user to confirm the choice
                    // TODO: Declare a double variable named coldest and set it to the method call.
                    //       Do not forget to pass in the temperatures array
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    break;
                }
                case 7: {
                    System.out.println("Thanks for using the program. See you next week.");
                    break;
                }
                default: {
                    System.out.println("There is something wrong with your choice. Please try again...");
                    break;
                }
            }
        } while(choice != 7);

        sc.close();
    }

    /**
     * ------ All the methods the user can run in this program -------------------------------
     */
    public static void displayTemperatures(double[] temperatures) {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for(int i = 0; i < temperatures.length; i++) {
            System.out.println(daysOfWeek[i] + "      " + temperatures[i]);
        }
    }

    public static double findColdestDay(double[] temperatures) {
        double lowest = temperatures[0];
        for(int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] < lowest) {
                lowest = temperatures[i];
            }
        }
        return lowest;
    }

    public static double findWarmestDay(double[] temperatures) {
        double warmest = temperatures[0];
        // TODO: Complete this code to find the warmest day.
        //       Hint, you can look at the code in findColdestDay to help you
        return warmest;
    }

    // TODO: Write the method for calculateAverageTemperature
}
