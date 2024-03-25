package decorator;

class LoyaltyDiscount {
    public double applyDiscount(double cost, String loyaltyLevel) {
        switch (loyaltyLevel) {
            case "MEMBER":
                return cost * 0.95; 
            case "ELITE":
                return cost * 0.9; 
            default:
                return cost; // no discount
        }
    }
}