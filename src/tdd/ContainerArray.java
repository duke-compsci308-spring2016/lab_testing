package debug;


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

    public void add (E element) { //more than 10 items means error, need to copy to new array
        internalArray[currentSize++] = element;
    }

    public int size () {
        return currentSize;
    }

    public void remove (E objectToRemove) { //removing item which isn't in container, also item still stays there,
        currentSize--; //only works as stack right now
    } //may result in negative size

    @SuppressWarnings("unchecked")
    public E get (int index) { //negative index, index out of bounds
        return (E)internalArray[index];
    }
}
