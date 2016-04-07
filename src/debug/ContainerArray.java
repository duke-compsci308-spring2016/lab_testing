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
    	for (int i = 0; i < internalArray.length; i++) {
    		if (internalArray[i] == objectToRemove) {
    			for (int j = i; j < internalArray.length - 1; j++) {
    				internalArray[j] = internalArray[j+1];
    			}
    			break;
    		}
    	}
        currentSize--;
    }

    @SuppressWarnings("unchecked")
    public E get (int index) {
        return (E)internalArray[index];
    }
}
