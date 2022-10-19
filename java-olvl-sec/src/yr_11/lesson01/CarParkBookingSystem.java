package yr_11.lesson01;

import java.util.Scanner;

public class CarParkBookingSystem {

    // Declaration of class variables (global scope)
    public static String[] bookingTable = new String[20];

    // TODO: Declare int generalBookingsCount

    // TODO: Declare int accessibleBookingsCount

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*** Car Park Booking System ***");
        
        boolean halt = false;
        
        do {
            // TODO: Ask the user whether they need to book a slot

            // TODO: Ask the user to choose whether it should be general or accessible

            // TODO: Based on the input, call the right method to search for a slot

            // TODO: When a slot is available ask for booking reference and store in booking table and update count

            // TODO: Display the booking confirmation or an error message

            System.out.println("Would you like to continue making bookings? (yes/no)");
            String reply = sc.nextLine();
            if (reply.equals("no")) {
                halt = true;
            }
        } while(!halt);

        // TODO: Display generalBookingsCount

        // TODO: Display accessibleBookingsCount
        
        sc.close();
    }

    /**
     * A linear search within the bookingTable to find the next available slot
     * @return | A slot between 1 and 20, or -1 in case of fully booked
     */
    public static int nextAvailableAccessibleSpace() {
        int nextAvailable = -1;
        for (int i = 0; i < 20; i++) {
            if (bookingTable[i] == null) {
                nextAvailable = i;
                break;
            }
        }
        return nextAvailable; // -1 means there is no available space
    }

    // TODO: Method nextAvailableGeneralSpace()
}
