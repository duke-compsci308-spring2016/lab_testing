package debug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


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
    	if (currentSize != limit)
    		internalArray[currentSize++] = element;
    }
    
    public int size () {
        return currentSize;
    }

    public void remove (E objectToRemove) 
    {	if(currentSize==0){
    	
    }else{
    	List<Object> list = new ArrayList<Object>(Arrays.asList(internalArray));
    	list.remove(objectToRemove);
    	internalArray = list.toArray(internalArray);
    	
    	System.out.println(list.size());
    	currentSize --;
    }
    }
    
    @SuppressWarnings("unchecked")
    public E get (int index) {
    	if ( index >= 0 && index <= currentSize )
    		return (E)internalArray[index];
    	else
    		return null;
    }
}
