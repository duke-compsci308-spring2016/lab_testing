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
    	if (currentSize < limit) {
    		internalArray[currentSize++] = element;
    	} else {
    		//do nothing
    	}
    }

    public int size () {
        return currentSize;
    }

    public void remove (E objectToRemove) {
    	int startSize = currentSize;
    	for (int i = 0; i < startSize; i++) {
    		if (internalArray[i].equals((Object) objectToRemove)){
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
