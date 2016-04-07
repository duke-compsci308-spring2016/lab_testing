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
        internalArray[currentSize++] = element;
    }

    public int size () {
        return currentSize;
    }

    public void remove (E objectToRemove) {
        if (currentSize == 0 ) return;
        currentSize--;
    }

    @SuppressWarnings("unchecked")
    public E get (int index) {
        if(index>=currentSize && index < internalArray.length){
            return null;
        } else if ( index >= internalArray.length ) {
            throw new IndexOutOfBoundsException();
        }
        return (E)internalArray[index];
    }
}
