
package fooddeliveryapp;

/**
 *
 * @author Anjula
 */
import java.util.ArrayList;
import java.util.List;

public class Order {
    private User user;
    private List<FoodItem> items;

    public Order(User user) {
        this.user = user;
        this.items = new ArrayList<>();
    }

    public void addItem(FoodItem foodItem) {
        items.add(foodItem);
    }

    public List<FoodItem> getItems() {
        return items;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public double calculateTotal() {
        double total = 0;
        for (FoodItem item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
