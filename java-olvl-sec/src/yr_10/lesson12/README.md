# Array Helpers

Aside from the `length` property, an array does not come with any useful built-in functionality.

Below is a screenshot of the "hints" I get when I used Visual Studio Code.

<img src="" height="300" width="auto">

This is slightly strange because arrays are so useful, and there are so many things we would want to go with a group of elements:

- Find the largest value.
- Find the smallest value.
- Find the sum of all values (if the array is numerical).
- Shuffle elements to get a jumbled up array.
- Look for a particular value.

All of the above routines are very useful, and most likely you will need to use at least one of the above in your coursework. But, we don't have to code all of the above on our own, we can do it as a class!

The `ArrayHelpers.java` already contains some helpful routines which have been coded by older students. It is your turn now to do your bit.

## ArrayHelpers.java usage

## Are you up for the challenge?

Above, we have listed common helper methods to do with arrays. Methods to filter elements in an array, for example, return all the integers greater than 5 are extremely useful too but slightly more challenging.
If you are up for the challenge, here are a few ideas. When you manage, let your teacher know so that your contribution could be added to the repository with *your name* on it!

- Greater Than (Number Arrays)
- Less Than (Number Arrays)
- Starting With (String Arrays)
- Ending With (String Arrays)
- Contains (String Arrays)

# Testing our code

Not many students realise this, but you should know that a big part of creating solutions is actually testing them. This should make sense, otherwise how will we know that our creations are actually of use?In fact, testing is a big part of the job. So programmers also write even more code to just test their solutions. We call them *automated tests*.

## Unit Test

The simplest form of testing is Unit Testing. A unit test is a small piece of code that checks whether another piece of code works well with a specific data set. The idea is that if you test the smallest most useful bits of your code in isolation, and they all work as designed, then your software application *should* work. In this lesson we will be writing unit tests for methods in the `ArrayHelpers`. 

Here is an example of a unit test:

```
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
```

The basic properties of any unit test:
1. Test data.
2. Expected outcome.
3. Math the specific method call that gives an actual result with the test data.
4. Check that the expected outcome and actual result are equal. When equal the test passes, otherwise its a fail (so something is perhaps not working as it should).