import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems =  new ArrayList<>();

    public void AddMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

}
