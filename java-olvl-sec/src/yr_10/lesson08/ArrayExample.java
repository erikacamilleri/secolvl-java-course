package yr_10.lesson08;

public class ArrayExample {
    
    public static void lesson() {

        // Declaring an array of double where we can store ten double elements
        double[] runningTimes = new double[10];

        // Declare a double variable to store the total of running times
        double total = 0;

        // Inserting the first element
        runningTimes[0] = 4.0; // 4 seconds
        runningTimes[1] = 5.6; // 5.6 seconds
        runningTimes[2] = 0.2; // 0.2 seconds
        runningTimes[3] = 1.27; // 1.27 seconds
        runningTimes[4] = 4.5; // 4.5 seconds
        runningTimes[5] = 0.2; // 0.2 seconds
        runningTimes[6] = 0.2; // 0.2 seconds
        runningTimes[7] = 0.2; // 0.2 seconds
        runningTimes[8] = 0.2; // 0.2 seconds
        runningTimes[9] = 0.2; // 0.2 seconds

        for(int i = 0; i < 10; i++) {
            // total = total + the current runningTime element
            total = total + runningTimes[i];
        }

        System.out.println("Total: " + total);

        // declare a double variable and call it average
        double average;

        // calculate the average
        average = total / 10.00;

        System.out.println("Average: " + average);
    }
}
