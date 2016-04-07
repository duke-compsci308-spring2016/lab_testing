package debug;

import java.util.ArrayList;
import java.util.List;

public class ContainerArray<E> {
    private int limit;
    private List<Object> internalList;
    private static final int DEFAULT_LIMIT = 10;

    public ContainerArray () {
        this(DEFAULT_LIMIT);
    }

    public ContainerArray (int initialCapacity) {
    	limit = initialCapacity;
        internalList = new ArrayList<Object>();
    }

    public void add (E element) {
    	if(internalList.size()<limit){
    		internalList.add(element);
    	}
    }

    public int size () {
        return internalList.size();
    }

    public void remove (E objectToRemove) {
    	internalList.remove(objectToRemove);
    }
    
    public void removeAll(E objectToRemove) {
    	for (int i = 0; i < internalList.size(); i++){
    		if (internalList.get(i).equals(objectToRemove)){
    			internalList.remove(i);
    		}
    	}
    }

    @SuppressWarnings("unchecked")
    public E get (int index) {
        return (E) internalList.get(index);
    }
}
