package decorator;

class Burger implements FoodItem {
    public double getCost() {
        return 5.00; 
    }
    
    public String getDescription() {
        return "Burger";
    }
}
