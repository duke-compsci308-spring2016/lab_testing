package debug;

public class ContainerArray<E> {
    private int currentSize = 0;
    private static final int INITIAL_CAPACITY = 10;
    private int capacity;
    private Object[] internalArray;

    public ContainerArray () {
        this(INITIAL_CAPACITY);
    }

    public ContainerArray (int initialCapacity) {
        internalArray = new Object[initialCapacity];
        capacity = initialCapacity;
    }

    public void add (E element) {
    	Object[] newInternalArray = new Object[capacity * 2];
    	if ((currentSize + 1) > capacity) {
    		for (int i = 0; i < capacity; i++) {
    			newInternalArray[i] = internalArray[i];
    		}
    		capacity = capacity * 2;
    	    newInternalArray[currentSize++] = element;
    	    internalArray = newInternalArray;
    	}
    	else {
    		internalArray[currentSize++] = element;
    	}
    }

    public int size () {
        return currentSize;
    }

    public void remove (E objectToRemove) {
        for (int i = 0; i < currentSize; i++) {
        	if (internalArray[i].equals(objectToRemove)) {
        		for (int j = i; j < currentSize - 1; j++) {
        			internalArray[j] = internalArray[j + 1];
        		}
        		i--;
        		currentSize--;
        	}
        }
        //Does not remove object from internalArray
        //currentSize needs to be decremented as many times as there are objectToRemove's
    }

    @SuppressWarnings("unchecked")
    public E get (int index) {
    	//Does not check if index is out of bounds
    	if (index > currentSize) {
    		return null;
    	}
        return (E) internalArray[index];
    }
}
