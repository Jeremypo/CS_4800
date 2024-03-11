package hw4.Macronutrients;

import java.util.HashMap;
import java.util.Map;

public class SingletonFactory {
    private static final Map<String, MacronutrientFactory> factories = new HashMap<>();

    static {
        factories.put("no restriction", new NoRestrictionMacronutrientFactory());
        factories.put("paleo", new PaleoMacronutrientFactory());
        factories.put("vegan", new VeganMacronutrientFactory());
        factories.put("nut allergy", new NutAllergyMacronutrientFactory());
    }

    public static MacronutrientFactory getFactory(String dietPlan) {
        return factories.getOrDefault(dietPlan.toLowerCase(), new NoRestrictionMacronutrientFactory());
    }
}
