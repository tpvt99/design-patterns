package iterator_section;

import java.util.List;

public class PancakeHouseIterator implements Iterator{
    int currentPosition;
    List<MenuItem> menuItemList;

    public PancakeHouseIterator(List<MenuItem> menuItemList) {
        currentPosition = 0;
        this.menuItemList = menuItemList;
    }

    @Override
    public MenuItem next() {
        if (hasNext()) {
            MenuItem menuItem = menuItemList.get(currentPosition);
            currentPosition+=1;
            return menuItem;
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < menuItemList.size();
    }
}