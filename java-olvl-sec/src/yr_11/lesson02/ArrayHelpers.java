package yr_11.lesson02;

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
        // TODO Fisher Yates Shuffle
        // Write down the numbers from 1 through N.
        // Pick a random number k between one and the number of unstruck numbers remaining (inclusive).
        // Counting from the low end, strike out the kth number not yet struck out, and write it down at the end of a separate list.
        // Repeat from step 2 until all the numbers have been struck out.
        // The sequence of numbers written down in step 3 is now a random permutation of the original numbers.
        int size = elements.length;
        int[] shuffled = new int[size];
        return shuffled;
    }
}
