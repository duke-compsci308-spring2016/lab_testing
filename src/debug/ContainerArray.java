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
    	if(currentSize == limit) {
    		limit *= 2;
    		internalArray = new Object[limit];
    	}
        internalArray[currentSize++] = element;
    }

    public int size () {
        return currentSize;
    }

    public void remove (E objectToRemove) {
    	for(int i=0;i<internalArray.length;i++){
    		if(internalArray[i]==objectToRemove){
    			removeIndex(i);
    		}
    	}
        currentSize--;
    }
    public void removeIndex(int i){
    	for(int j=i;j<internalArray.length-1;j++){
    		internalArray[j]=internalArray[j+1];
    	}
    }

    @SuppressWarnings("unchecked")
    public E get (int index) {
        return (E)internalArray[index];
    }
}
