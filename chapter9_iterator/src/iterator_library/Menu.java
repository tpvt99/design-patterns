package iterator_library;

import iterator_section.MenuItem;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
