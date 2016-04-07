package debug;


public class ContainerArray<E> {
    private int limit;
    private int currentSize = 0;
    private Object[] internalArray;

    public ContainerArray () {
        this(10);
    }

    public ContainerArray (int limit) {
    	this.limit = limit;
        internalArray = new Object[limit];
    }

    public void add (E element) {
    	int currentIndex = -1;
    	for(int i = 0; i < limit; i++) {
    		if(internalArray[i] == null) {
    			currentIndex = i;
    			break;
    		}
    	}
    	try {
    		internalArray[currentIndex] = element;
    		currentSize++;
    	} catch(Exception e) {
    		throw new ArrayIndexOutOfBoundsException();
    	}
    }

    public int size () {
        return currentSize;
    }

    public void remove (E objectToRemove) {
    	for(int i = 0; i < currentSize; i++) {
    		if(internalArray[i] == objectToRemove) {
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
