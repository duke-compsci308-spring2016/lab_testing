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
		if(currentSize < internalArray.length){
			internalArray[currentSize++] = element;
		}
	}

	public int size () {
		return currentSize;
	}

	public void remove (E objectToRemove) {
		int removeIndex = -1;
		for(int i = 0;i < currentSize;i++){
			if(internalArray[i].equals(objectToRemove)){
				removeIndex = i;
			}
		}
		if(removeIndex >= 0){
			removeElement(removeIndex);
			currentSize--;
		}
	}
	private void removeElement(int index){
		for(int i = index;i < currentSize-1;i++){
			internalArray[i] = internalArray[i+1];
		}
	}


	@SuppressWarnings("unchecked")
	public E get (int index) {
		return (E)internalArray[index];
	}
}
