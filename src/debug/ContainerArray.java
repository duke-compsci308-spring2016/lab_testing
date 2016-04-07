package debug;

import java.util.Arrays;


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
    	int toBeRemoved = 0;
    	
    	if (objectToRemove instanceof String) {
    		int n = 0;
    		while (internalArray[n] != null){
    			if (((String)internalArray[n]).equals((String) objectToRemove)){
    				internalArray[n] = null;
    				toBeRemoved++;
    			}
    		n++;
    	}
        internalArray = Arrays.stream(internalArray)
                .filter(s -> (s != null))
                .toArray(Object[]::new); 
        
        currentSize -= toBeRemoved;
    }
    }

    @SuppressWarnings("unchecked")
    public E get (int index) {
        return (E)internalArray[index];
    }
}
