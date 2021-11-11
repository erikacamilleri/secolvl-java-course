package yr_11.lesson02;

import java.util.Random;

public class ArrayHelpers {
    
    public static int linearSearch(int[] elements, int target) {
        boolean isFound = false;
        int targetPosition = -1;
        int size = elements.length;
        int current = 0;
        while(current < size && isFound == false) {
            int compare = elements[current];
            if (compare == target) {
                isFound = true;
                targetPosition = current;
            }
            current = current + 1;
        }
        return targetPosition;
    }

    public static int linearSearch(String[] elements, String target) {
        boolean isFound = false;
        int targetPosition = -1;

        int size = elements.length;
        int current = 0;

        while(current < size && isFound == false) {
            String compare = elements[current];
            if (compare.equals(target)) {
                isFound = true;
                targetPosition = current;
            }
            current = current + 1;
        }                  
        return targetPosition;
    }

    public static int[] shuffle(int[] elements) {
        // Declare a new array to store our shuffled numbers
        int size = elements.length;
        int[] shuffled = new int[size];
        
        // Write down the numbers from 1 through N.
        int[] k = new int[size];
        for(int i = 0; i < size; i ++) {
            k[i] = i;
        }

        Random randomiser = new Random();
        int endOfList = size - 1;
        do {
            // Pick a random number k between one and the number of unstruck numbers remaining (inclusive).
            int strikeOutIndex = -1;
            while(strikeOutIndex == -1) {
                int nextRandomIndex = randomiser.nextInt(size);
                strikeOutIndex = linearSearch(k, nextRandomIndex);
                System.out.println(nextRandomIndex + " " + strikeOutIndex);
            }
            // Counting from the low end, strike out the kth number not yet struck out, and write it down at the end of a separate list.
            k[strikeOutIndex] = -1;
            
            shuffled[endOfList] = elements[strikeOutIndex];
            endOfList = endOfList - 1;
        } while (!(isAllSameValues(k, -1))); // Repeat until all k numbers are struck out

        // The sequence of numbers written down in step 3 is now a random permutation of the original numbers.
        return shuffled;
    }

    public static boolean isAllSameValues(int[] elements, int value) {
        boolean flag = false;
        for(int i=0; i < elements.length; i++) {
            if(value != elements[i]) {
                // found a different element!
                flag = true;
            }
        }
        return !(flag);
    }
}
