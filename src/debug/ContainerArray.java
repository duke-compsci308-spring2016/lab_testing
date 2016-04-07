package debug;

import java.util.ArrayList;
import java.util.List;


public class ContainerArray<E> {
    private int limit;
    private List<E> internalArray;

    public ContainerArray () {
        this(10);
    }

    public ContainerArray (int limit) {
        internalArray = new ArrayList<>();
        this.limit = limit;
    }

    public void add (E element) {
    	if (size() < limit){
         internalArray.add(element);
    	}
    }

    public int size () {
        return internalArray.size();
    }

    public void remove (E objectToRemove) {
			if (internalArray.contains(objectToRemove)){
				internalArray.remove(objectToRemove);
			}
    }

    public E get (int index) {
        return internalArray.get(index);
    }

	public boolean contains(E element) {
		for (int i = 0; i < internalArray.size(); i++ ){
			if (internalArray.get(i).equals(element)){
				return true;
			}
		}
		return false;
	}
}
