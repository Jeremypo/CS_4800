package decorator;

class HotDog implements FoodItem {
    public double getCost() {
        return 1.50; 
    }
    
    public String getDescription() {
        return "Hot Dog";
    }
}