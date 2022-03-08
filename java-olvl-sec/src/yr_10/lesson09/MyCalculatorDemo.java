package yr_10.lesson09;

public class MyCalculatorDemo {
    
    public static void lesson() {
        // How to call it
        int num3 = MyCalculator.add(5, 2);
        System.out.println(num3);

        int num4 = MyCalculator.sub(5, 2);
        System.out.println(num4);

        double num5 = MyCalculator.sqrt(2);
        System.out.println(num5);

        double error = MyCalculator.div(5, 0);
        System.out.println(error);
    }
}
