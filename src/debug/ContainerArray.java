package debug;

import java.util.ArrayList;

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
        if(currentSize == limit) return;
        
        internalArray[currentSize++] = element;
    }

    public int size () {
        return currentSize;
    }

    public void remove (E objectToRemove) {
        ArrayList<E> values = new ArrayList<E>();
        for(int i = 0; i < internalArray.length; i++){
            if(!this.get(i).equals(objectToRemove)){
                values.add(this.get(i));
            }   
        }
        currentSize = values.size();
        internalArray = (Object[]) values.toArray();
    }

   
    @SuppressWarnings("unchecked")
    public E get (int index) {
        return (E)internalArray[index];
    }
    
    public boolean contains(E objectToRemove){
        for(int i = 0; i < internalArray.length;i++){
            if(objectToRemove.equals(this.get(i))){
                return true;
            }
        }
        return false;
    }
}
