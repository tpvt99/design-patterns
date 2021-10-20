package composite;

import iterable.Menu;
import iterator_section.MenuItem;

import java.util.Iterator;

public class Waitress {
    MenuComponent menuComponent;

    public Waitress(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    public void printMeu() {
        menuComponent.print();
    }
}
