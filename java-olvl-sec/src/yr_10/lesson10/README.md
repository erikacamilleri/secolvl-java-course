# Meny Driven Program

The menu-driven program in Java is a program that displays a menu and then takes input from the user to choose an option from the displayed menu. The output is given by the program based on the option selected by the user. This type of program interacts a lot with the user, and hence, it is user-friendly.

The menu-driven Java program we will be building can calculate the area of the various geometrical figures, using Java switch-case, on the basis of choice given by the user.

## Sample Output

> *** Welcome, use this program to calculate area of a shape! ***
> 1. Area of Right Angle Triangle
> 2: Area of Square
> 3: Area of Rectangle
> 5: Area of Circle
> 7: Quit
> Please type in your choice: 1
> Your choice is Area of Right Angle Triangle.
> Enter height:5
> Enter breadth:4
> The area of your right angle triange is: 10.0

## Our Task

We need to complete this program by performing the `TODOs`, you should find one for:
- Completing the display of the options menu
- Writing a completely new function to calculate the area of a shape of your choice
- Completing the switch case statement

## Taking it to the next level...

In order to make things really simple we made a few assumptions:
1. We assumed that the user will simply make his or her choice by typing in a number.
2. We assumed that the user will only need to calculate the area of one shape and then the program closes.

In future, we can wrap our switch case statement with a while loop so that the user can keep on using functions until they eventually quit the program. But we can leave that detail for another time!