package decorator;

class Cheese extends FoodItemDecorator {
    public Cheese(FoodItem item) {
        super(item);
    }

    public double getCost() {
        return item.getCost() + 0.50; // Adding cost for cheese
    }
    
    public String getDescription() {
        return item.getDescription() + ", Cheese";
    }
}
