import yr_11.lesson01.FoodExpress;
import yr_11.lesson02.ArrayHelpers;
public class App {
    public static void main(String[] args) throws Exception {
        // FoodExpress.displayMenu();
        // int foodCode = FoodExpress.placeOrder();
        // FoodExpress.addFoodItemToCart(foodCode);

        int[] elements = {5, 6, 4, 8, 12};
        // Expect position to be 2
        int position = ArrayHelpers.linearSearch(elements, 4);
        System.out.println(position);

        String[] names = {"Luke", "Ali", "Omar", "Fabio", "Timmy", "Carl"};
        // Expect position to be 2
        int namePosition = ArrayHelpers.linearSearch(names, "Fabio");
        System.out.println(namePosition);

        ArrayHelpers.shuffle(elements);
    }
}
