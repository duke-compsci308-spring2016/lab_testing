package src.debug;

import java.util.Arrays;
import java.util.List;

public class ContainerArray<E> {
    private int initialCapacity = 10;
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
    	List<Object> list = Arrays.asList(internalArray);
    	System.out.println(list);
    	list.remove(objectToRemove);
    	System.out.println(list);
    	internalArray = list.toArray(new Object[initialCapacity]);
    	System.out.println(internalArray);
        currentSize--;
    }

    @SuppressWarnings("unchecked")
    public E get (int index) {
        return (E)internalArray[index];
    }
}
