package adapter;

import adapter.enumiter.IteratorAdapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapterTest {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        Iterator<Integer> b = a.iterator();

        Enumeration<Object> enumeration = new IteratorAdapter(b);
        while (enumeration.hasMoreElements())
            System.out.println(enumeration.nextElement());

    }
}
