import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCafe {
    
	public static void main(String[] args) {
	    // TO-DO:
        // Create an instance of the CafeUtil class        
        CafeUtil appTest = new CafeUtil();
    
        //Test Cases Here
        System.out.println("---------STREAK GOAL TEST-------");
        System.out.printf("Purchases needed by week 10: %s \n", appTest.getStreakGoal(10));
        
        System.out.println("-------PRICE CHART TEST-------");
        appTest.printPriceChart("Chai Latte Mix", 4.5, 3);
        appTest.printPriceChart("Spcialty Coast", 2.0, 5);

        System.out.println("--------ORDER TOTAL TEST-------");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n",appTest.getOrderTotal(lineItems));

        System.out.println("----- Display Menu Test-----");
        List<String> loadMenu = Arrays.asList( "drip coffee", "cappucino", "latte", "mocha" );
        List<Double> loadPrices = Arrays.asList(1.5, 3.5, 4.5, 3.5);
        ArrayList<String> menu = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();
    
        menu.addAll(loadMenu);
        prices.addAll(loadPrices);
        appTest.displayMenu(menu, prices);

        System.out.println("----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // Test 4 times
        for (int i = 0; i < 4; i++) { 
	appTest.addCustomer(customers); 
	System.out.println(customers);
        }
}
}
