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

    public void add (E element) {
        internalArray[currentSize++] = element;
    }

    public int size () {
        return currentSize;
    }

    public void remove (E objectToRemove) {
       if (getObjectIndex(objectToRemove) != -1) {
    	   internalArray[getObjectIndex(objectToRemove)] = null;
       }
       currentSize--;
    }
    
    /*
     * Get first instance of the object
     */
    private int getObjectIndex(E element) {
    	for (int k = 0; k < internalArray.length; k++) {
    		if (internalArray[k].equals(element)) {
    			return k;
    		}
    	}
    	return -1;
    }
    
    @SuppressWarnings("unchecked")
    public E get (int index) {
        return (E)internalArray[index];
    }
}
