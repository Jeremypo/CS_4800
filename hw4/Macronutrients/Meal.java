package hw4.Macronutrients;

public class Meal {
    String carbs;
    String protein;
    String fats;

    public Meal(String carbs, String protein, String fats) {
        this.carbs = carbs;
        this.protein = protein;
        this.fats = fats;
    }

    @Override
    public String toString() {
        return String.format("Carbs: %s, Protein: %s, Fats: %s", carbs, protein, fats);
    }
}
