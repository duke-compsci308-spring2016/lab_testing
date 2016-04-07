package debug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainerArray<E> {
    private int initialCapacity = 10;
    private int currentSize = 0;
    private Object[] internalArray;

    public ContainerArray () {
        this(10);
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
        Object[] tempArray = new Object[internalArray.length-1];
        int counter = 0;
        
        if(internalArray.length > 0){
	        for(Object o: internalArray){
	        	if(o.equals(objectToRemove)){
	        		continue;
	        	}
	        	tempArray[counter] = 0;
	        	counter++;
	        }
        }
        internalArray = tempArray;
    }

    @SuppressWarnings("unchecked")
    public E get (int index) {
        return (E)internalArray[index];
    }
}
