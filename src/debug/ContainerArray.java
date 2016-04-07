package debug;

import java.util.List;

public class ContainerArray<E> {
    private static final int LIMIT = 10;
    private int currentSize = 0;
    private Object[] internalArray;

    public ContainerArray () {
        this(LIMIT);
    }

    public ContainerArray (int limit) {
        internalArray = new Object[limit];
    }

    public void add (E element) {			//1: handling array out of bounds; don't allow addition when full
    	if(currentSize < internalArray.length){
    		internalArray[currentSize++] = element;
    	}
    }
    
    public void addAll(List<E> toAdd){
    	for(E e: toAdd){
    		add(e);
    	}
    }

    public int size () {
        return currentSize;
    }

    public void remove (E objectToRemove) { //2: Remove object (first instance) and shift rightmost elements to left
    	int index = -1;						
    	for(int i = 0; i < internalArray.length; i++){
    		if(objectToRemove.equals(internalArray[i])){
    			index = i;
    			break;
    		}
    	}
    	if(index != -1){
    		for(;index < internalArray.length-1; index++){
    			internalArray[index] = internalArray[index+1];
    			internalArray[index+1] = null;
    		}
    		currentSize--;		//3: only decrement currentSize if something is removed
    	}
    }

    @SuppressWarnings("unchecked")
    public E get (int index) { //4: handle index out of bounds 
    	if(index>=0 && index < LIMIT) return (E)internalArray[index];
    	return null;
    }
}
