import yr_10.lesson08.ArrayExample;
import yr_10.lesson09.MyCalculatorDemo;

import java.util.Scanner;

/**
 * Lesson 10: A Menu Driven Program
 */
public class App {
    public static void main(String[] args) throws Exception {
        // Welcome message
        System.out.println("*** Welcome to my testing program ***");
        
        // Display a menu for all your lessons
        // TODO: call displayLessonsYear10()

        System.out.println();
        System.out.println("Which lesson would you like to demo today?");

        // Accept input
        Scanner sc = new Scanner(System.in);

        // TODO: in a char variable accept a user option like '1' or '9'

        // TODO: write a switch case to test option and for each option demo the write lesson.
        
    }

    /**
     * This is a method that does not return a value.
     * It is there to display options on the screen
     */
    public static void displayLessonsYear10() {
        System.out.println("Lesson 7. Safely Crossing Road");
        System.out.println("Lesson 8. Array Example");
        System.out.println("Lesson 9. My Calculator");
    }

    /**
     * ---- METHODS TO DEMONSTRATE PREVIOUS LESSONS ----
     */
    
    // TODO: Write methods to demo lessons 1 to 7. Use the examples below to help you out.

    public static void demoYear10Lesson8() {
        System.out.println("In this lesson I learnt how about arrays.");
        ArrayExample.lesson();
    }

    public static void demoYear10Lesson9() {
        System.out.println("In this lesson I learnt how to write methods.");
        MyCalculatorDemo.lesson();
    }
}
