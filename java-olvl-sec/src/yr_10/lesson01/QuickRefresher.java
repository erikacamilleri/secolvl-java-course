package yr_10.lesson01;

public class QuickRefresher {
    /**
     * We are imagining building a game like Mario Kart
     * where a player might have to collect items during a race.
     * In our game a racer has the opportunity to collect fruit tokens
     * like apples and bananas. Every banana is worth 2 points and every apple
     * is worth 3 points.
     * 
     * Let's create a simple program that can calculate the total number of points
     * when the player collected 5 apples and 3 bananas.
     */
    public static void lesson() {
        // Declare the variables
        int totalPlayerPoints = 0;
        int totalApples = 5;
        int totalBananas = 3;

        // Declare the constants
        final int POINTS_PER_APPLE = 3;
        final int POINTS_PER_BANANA = 2;

        // We are calculating how many points the player got
        // Using + to do addition
        totalPlayerPoints = (POINTS_PER_APPLE * totalApples) + (POINTS_PER_BANANA * totalBananas);

        // Using + to merge text 
        System.out.println("Total points for player: " + totalPlayerPoints);
    }
}
