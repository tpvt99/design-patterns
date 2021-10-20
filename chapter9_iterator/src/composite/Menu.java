package composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent{
    List<MenuComponent> menuComponentList;
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
        menuComponentList = new ArrayList<>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        this.menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        if (i < menuComponentList.size())
            return menuComponentList.get(i);
        return null;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.println("\n Menu name: " + getName() + " Description: " + getDescription());
        System.out.println("------------------");

        for (MenuComponent menuComponent : menuComponentList)
            menuComponent.print();
    }
}
