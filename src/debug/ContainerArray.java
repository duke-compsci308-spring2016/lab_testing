package debug;

import java.util.ArrayList;

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
    	if(currentSize<initialCapacity){
    		internalArray[currentSize++] = element;
    	}
        
    }

    public int size () {
        return currentSize;
    }

    public void remove (E objectToRemove) {
    	ArrayList<Object> temp = new ArrayList<>();
    	for(int i=0; i<internalArray.length; i++){
			temp.add(internalArray[i]);
		}
    	if(temp.contains(objectToRemove)){
    		temp.remove(objectToRemove);
    		currentSize--;
    		internalArray = temp.toArray(internalArray);
    	}
    }

    @SuppressWarnings("unchecked")
    public E get (int index) {
    	if(index>=initialCapacity){
    		return null;
    	}
        return (E)internalArray[index];
    }
}
