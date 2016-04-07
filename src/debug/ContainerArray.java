package debug;


public class ContainerArray<E> {
    private static int initialCapacity = 10;
    private int currentSize = 0;
    private Object[] internalArray;

    public ContainerArray () {
        this(initialCapacity);
    }

    public ContainerArray (int initialCapacity) {
        internalArray = new Object[initialCapacity];
    }

    public void add (E element) {
    	if(currentSize < initialCapacity) {
    		internalArray[currentSize++] = element;
    	}
    }

    public int size () {
        return currentSize;
    }

    public void remove (E objectToRemove) {
    	
    	for (int i=0; i<internalArray.length; i++) {
    		if (objectToRemove.equals(internalArray[i]))
    		{	
    			internalArray[i] = null;
    			currentSize--;
    		}
    	}
        
    }

    @SuppressWarnings("unchecked")
    public E get (int index) {
        return (E)internalArray[index];
    }
}
