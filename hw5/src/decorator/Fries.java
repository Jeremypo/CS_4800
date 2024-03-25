package decorator;

class Fries implements FoodItem {
    public double getCost() {
        return 3.00; 
    }
    
    public String getDescription() {
        return "Fries";
    }
}
