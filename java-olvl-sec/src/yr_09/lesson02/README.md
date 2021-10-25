# 1.2 Adding comments to a program

When we write programs we would want to write notes for ourselves to help us remember what we were doing when we look at our code later on. Also, to help other people understand what we have done. Comments are for us humans, therefore the compiler will know to ignore anything that is a comment.

## Multi-line comments

Long comments are enclosed with a /* and */. E.g.

```
/**
 * The first program that we write in Java
 *
 * @author Erika Camilleri
 * @version 0.1
 */
```

## Single line comments

Short comments are written with // in the beginning.

```
// Let's learn how to code!
```

# 1.3 Simple Data Types

All interesting programs that do something useful must store data! Data comes in all kinds so every programming language offers a set of data types. Java offers a comprehensive set. The following are the ones that are used the most.

- int (integers e.g. 56, 7, -2)
- float (real numbers e.g. 2.5)
- double (larger real numbers e.g. 2000.00)
- char (character e.g. 'A')
- boolean (true or false)

# 1.4 Declaring variables in Java

Our little pieces of data will be stores in our computer's memory as the program is executing. It is very important that each location is given a name! It would be good to point out that the location is referred to as a *variable* and the process of giving it a name is called a *declaration*. Fancy!

To declare a variable:
- indicate the appropriate type
- give it a name

Some rules about naming variables:
- the words you use cannot be keywords in the Java language
- the name cannot have spaces
- no math symbols like + or -
- the name must start with either a letter, or an underscore (_) or a dollar sign ($)

The convention in Java programs is to declare variables that start with a lower case letter. Since you cannot have spaces, if you would like the name to contain more than word then use upper case letters as separators e.g. myName.

```
int cpuUsage;

float temperature;
```