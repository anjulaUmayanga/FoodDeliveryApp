
package fooddeliveryapp;

/**
 *
 * @author Anjula
 */
import java.util.Scanner;

public class FoodDeliveryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create users and restaurants
        User user1 = new User("admin", "admin");
        Restaurant restaurant1 = new Restaurant("Restaurant A");
        
        restaurant1.addToMenu(new FoodItem("Burger", 5.99));
        restaurant1.addToMenu(new FoodItem("Pizza", 8.99));
        restaurant1.addToMenu(new FoodItem("Cola", 1.99));
        restaurant1.addToMenu(new FoodItem("Pepsi", 1.99));
        restaurant1.addToMenu(new FoodItem("Beer", 1.50));
        restaurant1.addToMenu(new FoodItem("Bun", 3.75));
        restaurant1.addToMenu(new FoodItem("Soda", 1.99));
        
        System.out.println("Welcome to Food Delivery App!");

        // User authentication
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        if (username.equals(user1.getUsername()) && password.equals(user1.getPassword())) {
            System.out.println("Login successful!");

            // Display restaurant menu
            System.out.println("Restaurant Menu:");
            for (FoodItem item : restaurant1.getMenu()) {
                System.out.println(item.getName() + " - $" + item.getPrice());
            }

            // Place an order
            Order order = new Order(user1);
            while (true) {
                System.out.print("Enter food item name (or 'done' to finish): ");
                String itemName = scanner.next();
                if (itemName.equalsIgnoreCase("done")) {
                    break;
                }
                for (FoodItem item : restaurant1.getMenu()) {
                    if (item.getName().equalsIgnoreCase(itemName)) {
                        order.addItem(item);
                        System.out.println(itemName + " added to the order.");
                        break;
                    }
                }
            }

            // Display order and total
            System.out.println("Order Summary:");
            for (FoodItem item : order.getItems()) {
                System.out.println(item.getName() + " - $" + item.getPrice());
            }
            System.out.println("Total: $" + order.calculateTotal());
        } else {
            System.out.println("Login failed. Invalid credentials.");
        }

        scanner.close();
    }
}

