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
        if (currentSize == limit) return;
        
        internalArray[currentSize++] = element;
    }

    public int size () {
        return currentSize;
    }

    public void remove (E objectToRemove) {
        Object[] newArray = new Object[limit];
        int count = 0;
        int objectsRemoved=0;
        for (Object o : internalArray){
            if (o != objectToRemove){
                newArray[count++] = o;
            } else {
                objectsRemoved++;
            }
        }
        internalArray = newArray;
        currentSize = objectsRemoved;
    }

    @SuppressWarnings("unchecked")
    public E get (int index) {
        return (E)internalArray[index];
    }
    
    public boolean contains(E objectContained){
        for (Object o : internalArray){
            if (o==objectContained){
                return true;
            }
        }
        return false;
    }
}
