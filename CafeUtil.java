import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal(int numberOfWeeks){
        int sum = 0;
        for (int i = 0; i < numberOfWeeks +1; i++){
            sum = sum + i;
        }
        return sum;
    }

    public void printPriceChart(String ProductName, double price, int maxNumber){
        System.out.println(ProductName);
        double originalPrice = price;
        for(int i = 0; i < maxNumber; i++){
            System.out.println(i + 1 + "-" + "$" + price + "\n");
            price = price + originalPrice - 0.5;
        }
    }

    public String getOrderTotal(double[] orderArr){
        double total = 0; 
        for (int i = 0; i <orderArr.length; i++){
            total += orderArr[i];
        }
        return String.format("Order Total: $%.2f \r\n", total);
    }
    
    public void displayMenu(ArrayList<String> items, ArrayList<Double> prices){
        for(int i = 0; i < items.size(); i++){
            System.out.println(i + " " + items.get(i) + "--" + "$" + prices.get(i));
        }
    }

    public ArrayList<String> addOneCustomer(ArrayList<String> customerArray) {
        System.out.println("Please enter name: ");
        String userName = System.console().readLine();
        customerArray.add(userName);
        System.out.println("Hello "+ userName + " ,\r\n" +"There are "+ (customerArray.size() - 1)+" people ahead of you.");
        return customerArray;

    }
    public ArrayList<String> addCustomer(ArrayList<String> customerArray) {
        while (true) {
            System.out.println("Please enter name or press 'q' to exit: ");
            String userName = System.console().readLine();
            if (userName.equals("q")){
                break;
            }

            customerArray.add(userName);

        }
        return customerArray;
    }

}
