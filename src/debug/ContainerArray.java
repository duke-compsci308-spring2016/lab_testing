package debug;


import java.util.Arrays;

public class ContainerArray<E> {
    private int capacity = 10;
    private int currentSize = 0;
    private Object[] internalArray;

    public ContainerArray () {
        this(10);
    }

    public ContainerArray (int initialCapacity) {

        capacity = initialCapacity;
        internalArray = new Object[initialCapacity];
    }

    public void add (E element) {
        internalArray[currentSize++] = element;
    }

    public int size () {
        return currentSize;
    }

    public void remove (E objectToRemove) {
        for (int i = 0; i < currentSize; i++){
            if (get(i).equals(objectToRemove)){
                internalArray = concatArray(capacity, Arrays.copyOfRange(internalArray,0,i),Arrays.copyOfRange(internalArray,i+1,currentSize));
                currentSize--;
                i--;
            }
        }
    }

    private Object[] concatArray(int size, Object[] a1, Object[] a2){
        Object[] arr = new Object[size];
        int i;
        for (i = 0; i < a1.length; i++){
            arr[i] = a1[i];
        }
        for (int j = 0; j < a2.length; j++){
            arr[i++] = a2[j];
        }
        return arr;
    }
    @SuppressWarnings("unchecked")
    public E get (int index) {
        return (E)internalArray[index];
    }
}
