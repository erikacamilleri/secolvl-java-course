# What do we code and why?

We learn how to program for one reason and one reason alone. A programming language like Java is a great way to express <b>algorithms</b> which in turn solve our problems. An algorithm is just a set of ordered instructions and coding them would mean that a computer can perform the algorithm!

However there are other ways in which we express algorithms:
- We can describe them in English
- We can also describe them in pseudocode (English which is similar to a programming language)

In fact, starting out with a set of instructions in English or in pseudocode is normally a good approach to understand problems.

# Making decisions/branching in Java

So far we have just written very simple algorithms with a set of instructions that execute one by one in the order we write them.
But we need so much more than that to solve interesting problems. We need to programs that can make **decisions** so that an algorithm can take one shape or another shape depending on what we are doing for example, we would only want to wave at a hamster if it is squeaking sweetly. If it is being aggressive, then we do not want to do anything.

In Java we can code decision making in a few ways:

- an `if` statement
- an `if ... else` statement
- a `switch` statement  

## The IF statement

```
if (/* boolean logic goes here (hello again chapter 10) */) {
    // instruction(s) that only get invoked when true
}
```

## The IF ... ELSE statement

```
if (/* boolean logic goes here (hello again chapter 10) */) {
    // instruction(s) that only get invoked when true
} else {
    // instruction(s) that only get invoked when false
}
```

## The SWITCH statement

Do you find yourself doing too many IF statements nested into each other? Maybe you need a switch! Why not try it out to check whether your code looks neater?

```
switch(/* a variable to check */) {
    case valueOne : {
        // instruction(s) that only get invoked when variable has valueOne
        break;
    }
    case valueTwo : {
        // instruction(s) that only get invoked when variable has valueTwo
        break;
    }
    case valueThree : {
        // instruction(s) that only get invoked when variable has valueThree
        break;
    }
    default : {
        // instruction(s) that only get invoked when variable has none of values
    }
}
```

## Arithmetic Comparison and Boolean Logic

We normally want the program to make decisions based on a combination of:

<ins>Arithmetic Comparison</ins>

- Equality `==`
- Less Than `<`
- Greater Than `>`
- Greater Than or Equal To `>=`
- Less Than or Equal To `<=`

<ins>Boolean Logic</ins>

- AND `&&`
- OR `||`
- NOT `!`

## Key Takeaways

- A program that can make choices can behave slightly differently each time it is run depending on the input.
- A program that just executes instructions in sequence will behave the same way each time no matter the input.