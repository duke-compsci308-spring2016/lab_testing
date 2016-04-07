package debug;


public class ContainerArray<E> {
    private static int limit = 10;
    private int currentSize = 0;
    private Object[] internalArray;

    public ContainerArray () {
        this(limit);
    }

    public ContainerArray (int limit) {
        internalArray = new Object[limit];
    }

    public void add (E element) {
        internalArray[currentSize++] = element;
    }

    public int size () {
        return currentSize;
    }

    public void remove (E objectToRemove) {
        //remove removes the first element in the list
    	// and then collapse all other elements down the list
    	boolean collapse = false;
        for(int i=0; i<currentSize; i++){
        	if(internalArray[i].equals(objectToRemove)){
        		internalArray[i] = null;
        		collapse = true;
        	}
        	if(collapse && i < internalArray.length-1){
        		internalArray[i] = internalArray[i+1];
        	}
        }
        currentSize--;
    }

    @SuppressWarnings("unchecked")
    public E get (int index) {
        return (E)internalArray[index];
    }
}
