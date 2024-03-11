package hw4.Pizza;
public class PizzaBuilder {
    private Pizza pizza;

    public PizzaBuilder() {
        pizza = new Pizza();
    }

    public PizzaBuilder setSize(String size) {
        pizza.setSize(size);
        return this;
    }

    public PizzaBuilder addTopping(String topping) {
        pizza.addTopping(topping);
        return this;
    }

    public PizzaBuilder setChain(String chain) {
        pizza.setChain(chain);
        return this;
    }

    public Pizza build() {
        return pizza;
    }
}