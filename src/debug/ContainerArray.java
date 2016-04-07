package debug;

public class ContainerArray<E> {
    private int limit = 10;
    private int currentSize = 0;
    private Object[] internalArray;

    public ContainerArray () {
        this(10);
    }

    public ContainerArray (int limit) {
        internalArray = new Object[limit];
    }

    public void add (E element) {
        if(!isArrayFull())
            internalArray[currentSize++] = element;
    }

    public int size () {
        return currentSize;
    }

    public void remove (E objectToRemove) {
        if (contains(objectToRemove)) {
            currentSize--;
            clearIndexLocationAndShiftElementsBack(indexOf(objectToRemove));
        }
    }

    private boolean isArrayFull(){
        return limit == currentSize;
    }
    
    private void clearIndexLocationAndShiftElementsBack (int index) {
        if (indexInBounds(index)) {
            for (int i = index; i < internalArray.length - 1; i++) {
                internalArray[i] = internalArray[i + 1];
            }
            internalArray[internalArray.length - 1] = null;
        }
    }

    private boolean indexInBounds (int index) {
        return index > 0 && index < internalArray.length;
    }

    public boolean contains (E element) {
        return !(indexOf(element) == -1);
    }

    public int indexOf (E element) {
        for (int i = 0; i < internalArray.length; i++) {
            if (internalArray[i] == element) {
                return i;
            }
        }

        return -1;
    }

    @SuppressWarnings("unchecked")
    public E get (int index) {
        return (E) internalArray[index];
    }
}
