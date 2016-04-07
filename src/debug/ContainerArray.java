package debug;

import java.util.ArrayList;

public class ContainerArray<E> {
	private int initialCapacity = 10;
	private int currentSize = 0;
	private ArrayList<Object> internalArray;

	public ContainerArray() {
		this(10);
	}

	public ContainerArray(int initialCapacity) {
		internalArray = new ArrayList<>();
	}

	public void add(E element) {
		internalArray.add(element);
	}

	public int size() {
		return internalArray.size();
	}

	public void remove(E objectToRemove) {
		internalArray.remove(objectToRemove);
	}

	@SuppressWarnings("unchecked")
	public E get(int index) {

		try {
			return (E) internalArray.get(index);
		} catch (Exception e) {
			return null;
		}
	}
}
