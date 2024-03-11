package hw4.Macronutrients;

import java.util.Random;

public class PaleoMacronutrientFactory extends MacronutrientFactory{
    private static final Random random = new Random();
    private static final String[] carbs = {"Pistachio"};
    private static final String[] proteins = {"Fish", "Chicken", "Beef"};
    private static final String[] fats = {"Avocado", "Tuna", "Peanuts"};

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
