package hw4.Macronutrients;

import java.util.Random;

public class NoRestrictionMacronutrientFactory extends MacronutrientFactory{
    private static final Random random = new Random();
    private static final String[] carbs = {"Cheese", "Bread", "Lentils", "Pistachio"};
    private static final String[] proteins = {"Fish", "Chicken", "Beef", "Tofu"};
    private static final String[] fats = {"Avocado", "Sour cream", "Tuna", "Peanuts"};

    @Override
    public String getCarbs() {
        return carbs[random.nextInt(carbs.length)];
    }

    @Override
    public String getProtein() {
        return proteins[random.nextInt(proteins.length)];
    }

    @Override
    public String getFats() {
        return fats[random.nextInt(fats.length)];
    }
}
