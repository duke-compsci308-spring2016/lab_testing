package debug;

import java.util.ArrayList;
import java.util.List;

public class ContainerArray<E> {
    private int limit = 10;
    private List<E> internalArray;

    public ContainerArray () {
        this(10);
    }

    public ContainerArray (int limit) {
        internalArray = new ArrayList<>();
    }

    public void add (E element) {
        if(internalArray.size() == limit) {
            throw new IndexOutOfBoundsException();
        }
        internalArray.add(element);
    }

    public int size () {
        return internalArray.size();
    }

    public void remove (E objectToRemove) {
        internalArray.remove(objectToRemove);
    }

    @SuppressWarnings("unchecked")
    public E get (int index) {
        return internalArray.get(index);
    }
}
