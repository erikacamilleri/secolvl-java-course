# Introduction to Procedures or Methods in Java

We have already started defining and calling methods to be quite frank with you, you just did not know it (sorry).

 - In the very first lesson we have met with the special `main()` - the entry point of a program. 
 - Each time we create a new class to do something new we also declare our `lesson()`. 

Just up till now we were creating methods that act like neat drawers to store our code, so that we can "open" them and "close" them whenever we deem it is necessary. Let me refresh your memory.

## Declaring and Defining our Lesson Method

```
public static void lesson() {
    // code written during the lesson
}
```
<b>Looking into the Anatomy</b>

- Header: the first four words followed by parenthesis
- Body: the two curly brackets and its contents

## Using the Method

This is also known as a *method call*. This is a recall of what we normally do in our lessons. 
The lesson code is neatly stowed in its own class and whenever we want to run it, we simply call it in our `App` class.

```
public class App {
    public static void main(String[] args) {
        // This is a method call
        ClassName.lesson()
    }
}
```
## Methods Check List

As we create some methods I will be showing you a few things that we can do:

- Method names that make sense and proper convention
    Method name that has one word: `add`
    Method name that has more than one word: `addTwoNumbers`
- Method without parameters e.g. ``lesson()``
- Method with parameters e.g. ``sub(int a, int b)``
- Method that does not give back a value, we say it is *void* e.g. ``sayHello()``
- Method that does give back a value, we say it *returns* something e.g. ``mul(int a, int b)``