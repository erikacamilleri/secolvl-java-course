# Java Revision I

Programming is like riding a bike. You might feel apprehensive and shaky in the beginning but previous practice will come back to you quickly. Since we practiced very regularly last year it will take you much quicker now to feel confident programming in Java.

A little refresher will not hurt, but the most efficient way to revise a number of skills is to solve a problem. Below is a list of what will be revised.

## Revision Checklist

- Declaring variables and assigning values.
- Declaring an array data structure.
- Store data in the array.
- Accept user input and display output.
- Write a conditional statement.
- Write a looping statement.
- Declaring/calling a method that returns a value.

## Car Park Booking System

An organisation has a visitor car park with 20 car parking spaces numbered 1 to 20. Car park spaces can be booked by visitors if they are available. In order to cater for special access needs, the organisation decided that parking slots from 1 to 5 will be solely reserved as *special access*. A user that has access needs will be given the first available parking slot from 1 to 20. A user that can do with a general parking slot will be given the last available parking space from 20 up to 6 in order to increase the chances of people with mobility issues to find better parking slots. The diagram below illustrates this policy.

<img src="https://raw.githubusercontent.com/erikacamilleri/secolvl-java-course/main/src/yr_10/lesson01/img/parking_slot.PNG"/>

### User Stories

In <a href="https://erikacamilleri.wixsite.com/bytesizelearning/post/chapter-50-problem-solving">Chapter 50</a> we looked into defining problems from a *user point of view*. This helps us feel that we are creating programs that can truly be useful and helpful to people.

1. As a <b>general</b> user, I would like to book a parking slot, so that I do not have to worry about my car being vandalised.

2. As a <b>special access</b> user, I would like to book a more convenient parking slot, so that it is not a struggle for me to get out of the car park. 

### Program Documentation

<b>Task 1</b>

When a user wants to book a slot the program will ask if it should be accessible or general. Depending on the reply, the program will proceed to either find the next available parking space by calling a method. If the method returns a -1 it means that there aren't available parking slots.

<img src="https://raw.githubusercontent.com/erikacamilleri/secolvl-java-course/main/src/yr_10/lesson01/img/flowchart.PNG">

When a slot is returned, the program will proceed to save the booking. The user will be asked to enter a booking reference that will contain the name and the number registration of the vehicle e.g. "Name Surname, ABC123". This information must be stored in the `bookingTable`, an array of `String` where each index represents a slot in the car park.

```
bookingTable[slot - 1] = bookingReference;
```

Finally the user will see a message displayed to confirm that a slot was booked e.g.,

"Booked Parking Slot 1: Anthony Collins, FBK324. Thank you for using this service."

<b>Task 2</b>

The program must keep track of how many accessible parking spaces were booked, and how many general parking spaces were booked. Therefore, after each successful booking, the program must update the appropriate variables.

These values will be displayed right before the program stops completely. 
