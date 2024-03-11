package hw4.Pizza;

public class driver{
    public static void main (String[] args){
        Pizza ph1 = new PizzaBuilder()
                .setChain("Pizza Hut")
                .setSize("Large")
                .addTopping("Pepperoni")
                .addTopping("Chicken")
                .addTopping("Spicy Pork")
                .build();
        ph1.eat();

        Pizza ph2 = new PizzaBuilder()
                .setChain("Pizza Hut")
                .setSize("Small")
                .addTopping("Pepperoni")
                .addTopping("Chicken")
                .build();
        ph2.eat();

        Pizza lc1 = new PizzaBuilder()
                .setChain("Little Caesars")
                .setSize("Medium")
                .addTopping("Pepperoni")
                .addTopping("Chicken")
                .addTopping("Spicy Pork")
                .addTopping("Bacon")
                .addTopping("Extra Cheese")
                .addTopping("Beef")
                .addTopping("Ham and Pineapple")
                .addTopping("Pesto")
                .build();
        lc1.eat();

        Pizza lc2 = new PizzaBuilder()
                .setChain("Little Caesars")
                .setSize("Small")
                .addTopping("Pepperoni")
                .addTopping("Chicken")
                .addTopping("Spicy Pork")
                .addTopping("Bacon")
                .addTopping("Extra Cheese")
                .addTopping("Beef")
                .build();
        lc2.eat();

        Pizza d1 = new PizzaBuilder()
                .setChain("Dominos")
                .setSize("Small")
                .addTopping("Pepperoni")
                .build();
        d1.eat();

        Pizza d2 = new PizzaBuilder()
                .setChain("Dominos")
                .setSize("Large")
                .addTopping("Pepperoni")
                .addTopping("Chicken")
                .addTopping("Bacon")
                .build();
        d2.eat();
    }
}