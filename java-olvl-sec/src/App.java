import yr_11.lesson01.FoodExpress;
public class App {
    public static void main(String[] args) throws Exception {
        FoodExpress.displayMenu();
        int foodCode = FoodExpress.placeOrder();
        FoodExpress.addFoodItemToCart(foodCode);
    }
}
