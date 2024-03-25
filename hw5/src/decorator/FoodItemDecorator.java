package decorator;

abstract class FoodItemDecorator implements FoodItem {
    protected FoodItem item;
    
    public FoodItemDecorator(FoodItem item) {
        this.item = item;
    }
}