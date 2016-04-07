package debug;


public class ContainerArray<E> {
    private int limit = 10;
    private int currentSize = 0;
    private Object[] internalArray;

    public ContainerArray () {
        this(10);
    }

    public ContainerArray (int initialCapacity) {
        internalArray = new Object[limit];
    }

    public void add (E element) {
        if (currentSize == limit) return;
    	internalArray[currentSize++] = element;
    }

    public int size () {
        return currentSize;
    }

    public void remove (E objectToRemove) {
    	currentSize--;
    	
    	int i = 0;
    	while (!internalArray[i].equals(objectToRemove)) {
    		i++;
    	}
    	if (i < currentSize) {
    		for (int k = i; k < currentSize; k++) {
    			internalArray[k] = internalArray[k+1];
    		}
    	}
    	internalArray[currentSize] = null;
    }

    @SuppressWarnings("unchecked")
    public E get (int index) {
        return (E)internalArray[index];
    }
}