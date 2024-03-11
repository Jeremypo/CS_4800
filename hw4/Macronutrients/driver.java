package hw4.Macronutrients;

public class driver {
    public static void main(String[] args){
        Customer[] customers = {
                new Customer("Jeremy", "No Restriction"),
                new Customer("Ryan", "Paleo"),
                new Customer("Villamil", "Vegan"),
                new Customer("Po", "Nut Allergy"),
                new Customer("John", "No Restriction"),
                new Customer("Doe", "Paleo")
        };

        for (Customer customer: customers){
            MacronutrientFactory factory = SingletonFactory.getFactory(customer.getDietPlan());
            Meal meal = new Meal(factory.getCarbs(), factory.getProtein(), factory.getFats());
            System.out.println(customer.getName() + "'s meal (" + customer.getDietPlan() + "):\n\t" + meal);
        }
    }

}
