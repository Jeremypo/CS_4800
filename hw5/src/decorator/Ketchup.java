package decorator;

class Ketchup extends FoodItemDecorator {
    public Ketchup(FoodItem item) {
        super(item);
    }

    public double getCost() {
        return item.getCost() + 0.25; // Adding cost for ketchup
    }
    
    public String getDescription() {
        return item.getDescription() + ", Ketchup";
    }
}
