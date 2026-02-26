import java.util.ArrayList;

public class MenuItem {

    private String name;
    private float price;


    private ArrayList<Ingredient> ingredients = new ArrayList<>();

    public MenuItem(String name, float price) {
        this.name = name;
        this.price = price;

    }

    public void AddIngredient(String name, float grams) {
        ingredients.add(new Ingredient(name, grams));
    }

    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }




}
