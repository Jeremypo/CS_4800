package hw4.Pizza;
import java.util.ArrayList;
import java.util.List;

public class Pizza{
    List<String> toppings = new ArrayList<>();
    String size;
    String chain;

    public void addTopping(String topping) {
        this.toppings.add(topping);
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public void eat() {
        System.out.println(chain + " (" + size + "): " + String.join(", ", toppings));
    }
}