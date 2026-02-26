import java.util.Scanner;

public class RestaurantApp {

    private Restaurant restaurant = new Restaurant();
    private Scanner scanner = new Scanner(System.in);


    void start(){

        while(true){
            System.out.println("====Restaurant-Menu-Management System=====");
            System.out.println("1)Add menu item");
            System.out.println("2)Show menu items");
            System.out.println("3)Exit");

            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    registerMenuItem();
                    break;
                case 2:
                    showOverview();
                    break;
                case 3:
                    return;


            }
        }
    }

    private void registerMenuItem(){
        System.out.println("---Register menu item---");

        System.out.print("Enter menu item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter menu item price: ");
        float price = scanner.nextFloat();
        scanner.nextLine();

        MenuItem menu = new MenuItem(itemName, price);

        while(true){

            System.out.print("Enter ingredient name(or done): ");
            String ingredient = scanner.nextLine();

            if(ingredient.equals("done")){
                break;
            }

            System.out.print("Enter ingredient quantity: ");
            float grams = scanner.nextFloat();
            scanner.nextLine();

            menu.AddIngredient(ingredient, grams);

        }

        restaurant.getMenu().AddMenuItem(menu);
        System.out.println("Menu item has been added successfully.");

    }

    private void showOverview() {

        System.out.println("---- Overview ----");

        for(MenuItem item : restaurant.getMenu().getMenuItems()) {

            System.out.print(item.getName() + " | " + item.getPrice() + " | ");

            for(Ingredient ing : item.getIngredients()) {
                System.out.print(ing.getName() + " " + ing.getGrams() + "g, ");
            }

            System.out.println();
        }




}}
