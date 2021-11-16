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
    /**
     * Trying to understand whether you need your umbrella can be really confusing!
     * We are trying 
     */
    public static void needUmbrella() {
        
        boolean isCloudy = false;
        boolean isRaining = false;
        boolean isSunny = false;
        boolean isWindy = false;
        boolean isGray = false;
        boolean isWarm = false;

        if (isWindy || isWarm || isSunny) {
            System.out.println("You do not need your umbrella.");
        } else if (isRaining || (isCloudy && isGray)) {
            System.out.println("Yes you need your umbrella.");
        } else {
            System.out.println("Not enough information about the weather.");
        }
    }

    public static void whatIsOnTheMenyToday() {
        int dayOfWeek = 1; // The number of days
        // TODO Change this to a switch statement
        if (dayOfWeek == 1) {
            System.out.println("Couscous with Mushrooms Mondays");
        } else if (dayOfWeek == 2) {
            System.out.println("Turkish Kebab Wraps Tuesdays");
        } else if (dayOfWeek == 3) {
            System.out.println("Chicken Curry and Rice Wednesdays");
        } else if (dayOfWeek == 4) {
            System.out.println("Pizza Thursdays");
        } else if (dayOfWeek == 5) {
            System.out.println("Beef Burgers with Fries Fridays");
        } else {
            System.out.println("Chicken Curry and Rice *or* Chicken Wraps without Couscous");
        }
    }
}
