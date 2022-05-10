package yr_10.lesson12;

public class ArrayHelpersTest {
    public static void main(String[] args) {
        // Run all unit tests
        testGetFirst();
        
        testIsAllSameValues();
        
        testIsntAllSameValues();
    }
    
    /**
     * A unit test for ArrayHelpers.getFirst()
     */
    public static void testGetFirst() {
        // 1. come up with good test data
        int[] testData = {2, 5, 8, 2};
        // 2. create a variable that will store the expected result of the code you are testing
        int expectedOutcome = 2;
        // 3. actually call the test subject and store its value
        int actualOutcome = ArrayHelpers.getFirst(testData);
        // 4. test that the expected result is what you actually get
        if (expectedOutcome == actualOutcome) {
            System.out.print("Pass ");
        } else {
            System.out.print("Fail ");
        }   
    }

    /**
     * A unit test for ArrayHelpers.isAllSameValues()
     */
    public static void testIsAllSameValues() {
         int[] testData = {2, 2, 2, 2};
         boolean expectedOutcome = true;
         boolean actualOutcome = ArrayHelpers.isAllSameValues(testData, 2);
         if (expectedOutcome == actualOutcome) {
             System.out.print("Pass ");
         } else {
             System.out.print("Fail ");
         }   
    }

    /**
     * A unit test for ArrayHelpers.isAllSameValues()
     */
    public static void testIsntAllSameValues() {
        int[] testData = {2, 5, 8, 2};
        boolean expectedOutcome = false;
        boolean actualOutcome = ArrayHelpers.isAllSameValues(testData, 2);
        if (expectedOutcome == actualOutcome) {
            System.out.print("Pass ");
        } else {
            System.out.print("Fail ");
        }   
   }
}
