package debug;


public class ContainerArray<E> {
    private static final int LIMIT = 10;
    private int currentSize = 0;
    private Object[] internalArray;

    public ContainerArray () {
        this(LIMIT);
    }

    public ContainerArray (int initialCapacity) {
        internalArray = new Object[initialCapacity];
        for(int i = 0; i < internalArray.length; i++)
        	internalArray[i] = "empty";
    }

    public String add (E element) {
    	if(currentSize >= LIMIT) return "is full";
        internalArray[currentSize++] = element;
        return "added";
    }

    public int size () {
        return currentSize;
    }

    public void remove (E objectToRemove) {
    	int idx =0;
    	for(Object e: internalArray) {
    		if(e.equals(objectToRemove)){
    			internalArray[idx] = "empty";
    		}
    		idx++;
    	}
        currentSize--;
    }

    @SuppressWarnings("unchecked")
    public E get (int index) {
    	if(index > LIMIT || index < 0)
    		return (E) "out of bounds";
        return (E)internalArray[index];
    }
}
