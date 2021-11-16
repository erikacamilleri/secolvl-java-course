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

Programming is a little bit like playing with blocks. You can also do...

```
if (/* boolean logic goes here (hello again chapter 10) */) {
    // instruction(s) that only get invoked when true
} else if (/* another boolean test goes here */) {
    // instruction(s) that only get invoked when true
} else {
    // instruction(s) that all previous statements are false
}
```

## The SWITCH statement

Do you find yourself doing too many IF statements nested into each other? Or too many IF...ELSE statements? Maybe you need a switch! A switch statement tests whether a given variable has a particular value from a possible set of values. This works very well with three or more values, for example, checking the day of the week of a particular date!

```
switch(/* a variable to check */) {
    case valueOne : {
        // instruction(s) that only get invoked when variable has valueOne
        break; // use break to get out of the switch when there is a match
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
Why not try it out to check whether your code looks neater?

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

Boolean logic expressions help make our if statements shorter and easier to read. For example,

```
if (isWarm) {
   if (isSunny) {
       System.out.println("Is warm and sunny!")
   }
}
```
is the same as:

```
if (isWarm && isSunny) {
    System.out.println("Is warm and sunny!")
}
```
Another example:
```
if (isWarm) {
    System.out.println("Wear a t-shirt!");
} else if (isSunny) {
    System.out.println("Wear a t-shirt!")
}
```
can be written as...

```
if (isWarm || isSunny) {
    System.out.println("Wear a t-shirt!")
}
```

Tah-duh!

One last one...

```
if (isWarm) {
    // do nothing
} else {
    System.out.println("Wear a jacket!")
}
```

Well, this looks a bit silly doesn't it? We are not doing anything interesting when isWarm is true! Might as well do...

```
if (!isWarm) {
   System.out.println("Wear a jacket!")
}
```
<iframe src="https://giphy.com/embed/3o6nUWcomi37MoVOpO" width="480" height="360" frameBorder="0" class="giphy-embed"></iframe>

## Key Takeaways

- A program that can make choices can behave slightly differently each time it is run depending on the input.
- A program that just executes instructions in sequence will behave the same way each time no matter the input.