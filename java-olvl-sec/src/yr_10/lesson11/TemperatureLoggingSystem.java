package yr_10.lesson11;

import java.util.Scanner;

public class TemperatureLoggingSystem {
    
    public static void main(String[] args) {
        // Creating object of Scanner class so that user can use keyboard
        Scanner sc = new Scanner(System.in);
        
        // Declare variable to store user's choice
        int choice = 0;

        // Declare an array to store the temperatures of last week
        // We must do this outside of the loop otherwise every time the data gets cleared!
        double[] temperatures = new double[7]; // 7 because 7 days of the week

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

            // Depending on the choice run the appropriate method
            switch (choice)
            {   
                case 1: {
                    // Guide the user to take appropriate steps
                    System.out.println("Your choice is: Log temperatures of last week.");
                    String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
                    for(int i = 0; i < 7; i++) {
                        System.out.print("Log temperature for " + daysOfWeek[i] + " ");
                        temperatures[i] = sc.nextDouble();
                    }
                    break;
                }
                case 2: {
                    // Guide the user to take appropriate steps
                    System.out.println("Your choice is: Display all the temperatures entered.");
                    displayTemperatures(temperatures);                    
                    break;
                }
                case 3: {
                    // Display a message to the user to confirm the choice
                    System.out.println("Your choice is: Find the coldest day");
                    // Declare a double variable named coldest and set it to the method call.
                    double coldest = findColdestDay(temperatures);
                    System.out.println("The coldest day was at the temperature: " + coldest);
                    break;
                }
                case 4: {
                    // Display a message to the user to confirm the choice
                    System.out.println("Your choice is: Find the warmest day");
                    // Declare a double variable named coldest and set it to the method call.
                    double warmest = findWarmestDay(temperatures);
                    System.out.println("The warmest day was at the temperature: " + warmest);
                    break;
                }
                case 5: {
                    // Display a message to the user to confirm the choice
                    System.out.println("Your choice is: Calculate the average temperature.");
                    // Declare a double variable named coldest and set it to the method call.
                    double average = calculateAverageTemperature(temperatures);
                    System.out.println("The average is: " + average);
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
        for(int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > warmest) {
                warmest = temperatures[i];
            }
        }
        return warmest;
    }

    // The method for calculateAverageTemperature
    public static double calculateAverageTemperature(double[] temperatures) {
        double sum = 0;
        for(int i=0; i < temperatures.length; i++) {
            sum = sum + temperatures[i];
        }
        return (sum/temperatures.length);
    }
}
