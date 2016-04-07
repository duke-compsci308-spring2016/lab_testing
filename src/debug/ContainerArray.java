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
    	int occur =0;
    	for(int i=0; i<currentSize; i++)
    		if(internalArray[i]==objectToRemove)
    			occur++;
    	
        currentSize-=occur;
    }

    @SuppressWarnings("unchecked")
    public E get (int index) {
    	if(currentSize<=0)
    		return null;
        return (E)internalArray[index];
    }
}

