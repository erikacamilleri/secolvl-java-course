package yr_10.lesson03;

/**
 * We code to solve problems and we design algorithms so that our problems
 * can be solved by a computer. Before diving head first into programming
 * it is a good idea to express algorithms in pseudocode. We will soon see
 * that pseudocode is so easy to convert into Java.
 * Full Course: https://brilliant.org/courses/computer-science-algorithms/building-blocks-v3/pseudocode/5/
 */
public class Branching {

    /**
     * A cute algorithm to greet a hamster.
     */
    public static void greetHamster() {
        // if hamster is squeaking
        // squeak back politely and wave at hamster
        boolean isHamsterSqueaking = true;
        
        if (isHamsterSqueaking) {
            // we are branching here!
            System.out.println("Squeak back politely!");
            System.out.println("Wave back!");
        }
    }

    /**
     * An algorithm that turns the tv on when the lights are off! Movie time.
     */
    public static void turnOnTv() {
        // Turn the TV off. Then, if the lights are on, turn the lights off.
        // If the lights are on, Then turn on the TV.
        boolean isLightsOn = true;

        if (isLightsOn) {
            System.out.println("Turn the lights off!");
            isLightsOn = false;
        }

        if (!isLightsOn) {
            System.out.println("Turn on TV!");
        }
    }

    /**
     * Our little hamsters are going on holiday!
     * This is an algorithm to tell them the weather conditions.
     */
    public static void guessWeather() {
        // If it's sunny, and if its warm, Then announce it's sunny and warm
        // If it's warm but it is not sunny, Then announce it's warm but not sunny
        boolean isSunny = true;
        boolean isWarm = true;
        if (isSunny) {
            if (isWarm) {
                System.out.println("It is sunny and warm!");
            }

            // In Java the ! operator is called not, and it changes true to false and vice versa
            if (!isSunny) {
                System.out.println("It is warm but not sunny!"); 
            }
        }
    }
}