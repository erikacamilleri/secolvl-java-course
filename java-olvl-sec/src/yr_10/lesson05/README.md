# More Loops with Java

We previously did the `for loop` in Java. While it is very useful (going to be extremely helpful in the future) sometimes we need a bit more flexibility. It is not always that we have a fixed start and fixed end. As life is, our programs also need to a bit more fluid. Java has got our backs!

## While Loop

Sometimes, repetition which is not fixed is required. In such cases a for loop is not very useful. However, the `while` loop offers non-fixed iteration.

```
while(/* test goes here */) {
    // instruction (s) to be repeated go here, may not be run!
}
```

## Do While Loop

This is very similar to a while loop, just the test condition is at the end not at the beginning.

```
do {
    // instruction (s) to be repeated go here, run at least once
} while (/* test condition goes here */) {
}
```

## Picking The Right Loop

As we keep learning about new constructs and tools, the challenge is now going to be to decide what construct is going to help us reach our goals best. With three different loops to choose from, even picking the right loop is going to be tricky. Don't worry... I have a few tips:

### You want a For Loop if...

There is a clear start and end (like a set of stairs, you are either going up in a step, or going down in a step)

### You want a While Loop if...

You cannot know how many times a block of code is going to repeat, but you know you should stop when something becomes true.

### You want a Do While Loop if...
You don't know how many times a block of code is going to repeat, but you know that it needs to run at least once, and stop when something becomes true. 