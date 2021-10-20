package iterable;


import java.util.Iterator;
import java.util.Calendar;

import iterator_section.MenuItem;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem>{

    MenuItem[] items;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        this.position = Calendar.DAY_OF_WEEK % 2;
    }

    @Override
    public MenuItem next() {
        MenuItem item = items[position];
        position += 2;
        return item;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null)
            return false;
        else
            return true;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Alternating Diner Menu Iterator does not support remove()");
    }
}
