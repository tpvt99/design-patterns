package iterator_section;

public class DinerMenuIterator implements Iterator {
    int current_size;
    int max_size;
    MenuItem[] menuItems;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        this.max_size = menuItems.length;
        this.current_size = 0;
    }

    @Override
    public MenuItem next() {
        if (hasNext()) {
            current_size += 1;
            return menuItems[current_size-1];
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return current_size < max_size && menuItems[current_size] != null;
    }
}
