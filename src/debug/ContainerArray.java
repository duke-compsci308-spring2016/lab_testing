package debug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainerArray<E> {
    private int limit = 10;
    private int currentSize = 0;
    private Object[] internalArray;

    public ContainerArray () {
        this(10);
    }

    public ContainerArray (int initialCapacity) {
        internalArray = new Object[initialCapacity];
    }

    public void add (E element) {
        internalArray[currentSize++] = element;
    }

    public int size () {
        return currentSize;
    }

    public void remove (E objectToRemove) {
    	List list = new ArrayList(Arrays.asList(internalArray));
    	list.remove(objectToRemove);
    	internalArray = list.toArray();
    	currentSize--;
    }

    @SuppressWarnings("unchecked")
    public E get (int index) {
        return (E)internalArray[index];
    }
}
