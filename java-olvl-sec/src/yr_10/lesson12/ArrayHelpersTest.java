package yr_10.lesson12;

import java.util.Arrays;

/**
 * We will fill this in when we do Testing.
 */
public class ArrayHelpersTest {

    public static void main(String[] args) {
        testSortIntArray();
    }

    public static void testSortIntArray() {
        int[] testData = {5, 3, 7, 4, 2};
        int[] expectedOutput = {2, 3, 4, 5, 7};

        int[] actualOutput = ArrayHelpers.sort(testData);

        if (Arrays.equals(actualOutput, expectedOutput)) {
            System.out.print("Pass ");
        } else {
            System.out.print("Fail ");
        }
    }
}
