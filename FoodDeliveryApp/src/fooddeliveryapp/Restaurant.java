
package fooddeliveryapp;

/**
 *
 * @author Anjula
 */
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private List<FoodItem> menu;

    public Restaurant(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
    }

    public void addToMenu(FoodItem foodItem) {
        menu.add(foodItem);
    }

    public List<FoodItem> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

