package iterator_section;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {
    List<MenuItem> menuItemList;

    public PancakeHouseMenu() {
        menuItemList = new ArrayList<>();

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs and toast",
                true, 2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false, 2.99);

        addItem("Blueberry Pancakes",
                "Panckes made with fresh blueberries",
                true, 3.59);

        addItem("Waffles",
                "Waffles with your choice of blueberries or strawberries",
                true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItemList.add(menuItem);
    }

    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItemList);
    }
}
