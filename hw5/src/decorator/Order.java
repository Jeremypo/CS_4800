package decorator;

import java.util.List;
import java.util.ArrayList;

public class Order {
    private List<FoodItem> items = new ArrayList<>();
    
    public void addItem(FoodItem item) {
        items.add(item);
    }
    
    public double getTotalCost() {
        return items.stream().mapToDouble(FoodItem::getCost).sum();
    }
}