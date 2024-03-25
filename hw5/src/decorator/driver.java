package decorator;

public class driver {
    public static void main(String[] args) {
        FoodItem burger = new Burger();
        burger = new Cheese(burger); 
        burger = new Ketchup(burger); 
        
        FoodItem fries = new Fries(); 
        fries = new Ketchup(fries);
        
        FoodItem hotdog = new HotDog();
        hotdog = new Ketchup(hotdog);
        
        Order order = new Order();
        order.addItem(burger);
        order.addItem(fries);
        order.addItem(hotdog);
        
        double totalCost = order.getTotalCost();
        System.out.println("Total Cost before discount: " + totalCost);
        
        LoyaltyDiscount discount = new LoyaltyDiscount();
        double finalCostMember = discount.applyDiscount(totalCost, "MEMBER");
        System.out.println("Total Cost (Level: MEMBER) after discount: " + finalCostMember);
        
        discount = new LoyaltyDiscount();
        double finalCostElite = discount.applyDiscount(totalCost, "ELITE");
        System.out.println("Total Cost (Level: ELITE) after discount: " + finalCostElite);
    }
}
