package debug;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class ContainerArray<E> {
    private int limit = 10;
    private int currentSize = 0;
    private E[] internalArray;

    public ContainerArray () {
        this(10);
    }

    public ContainerArray (int initialCapacity) {
        internalArray = (E[]) new Object[initialCapacity];
    }

    public void add (E element) {
        internalArray[currentSize++] = element;
    }

    public int size () {
        return currentSize;
    }

    public void remove (E objectToRemove) {
    	List<E> myList =  new ArrayList<E> (Arrays.asList(this.internalArray));
    	if(myList.remove(objectToRemove)) currentSize--;
    	this.internalArray = (E[]) myList.toArray();
    }

    @SuppressWarnings("unchecked")
    public E get (int index) {
        return internalArray[index];
    }
    
    public static void main (String[] args) {
       ContainerArray<String> myContainer = new ContainerArray<>();
        myContainer.add("test");
        myContainer.remove("test");
    }
}
