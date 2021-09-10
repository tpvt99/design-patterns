package adapter.enumiter;

import java.util.Iterator;
import java.util.Enumeration;

public class EnumeratorAdapter implements Iterator<Object> {

    private Enumeration<Object> enumeration;

    public EnumeratorAdapter(Enumeration<Object> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
