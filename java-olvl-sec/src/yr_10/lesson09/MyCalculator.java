package yr_10.lesson09;

/**
 * Learning about methods in Java
 */
public class MyCalculator {
    
    public static int add(int num1, int num2) {
        int num3 = num1 + num2;
        return num3;
    }

    public static int sub(int num1, int num2) {
        int num3 = num1 - num2;
        return num3;
    }

    public static int mul(int num1, int num2) {
        int num3 = num1 * num2;
        return num3;
    }

    public static double div(double num1, double num2) {
        if (num2 > 0) {
            double num3 = num1 / num2;
            return num3;
        }
        // normally when something bad happens
        return -1;
    }

    public static double sqrt(int num) {
        return Math.sqrt(num);
    }
}
