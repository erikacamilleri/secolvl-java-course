package yr_10.lesson12;

public class ArrayHelpersTest {
    public static void main(String[] args) {
        testIsAllSameValues();
    }

    public static void testIsAllSameValues() {
         int[] testData = {2, 2, 2, 2};
         boolean expectedOutcome = true;
         boolean actualOutcome = ArrayHelpers.isAllSameValues(testData, 2);
         if (expectedOutcome == actualOutcome) {
             System.out.print("Pass");
         } else {
             System.out.print("Fail");
         }   
    }
}
