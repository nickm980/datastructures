package basic;

import basic.interfaces.IList;

public class List<T> implements IList<T> {

    T arr[];
    int size;
    
    public List(){
	arr = (T[]) new Object[2];
	size = 2;
	printContents();
    }
    
    public int size() {
	return size;
    }

    public boolean isEmpty() {
	return size < 0;
    }

    public boolean contains(Object o) {
	return indexOf(o) != -1;
    }

    public void add(T e) {
	int index = size + 1;
	
	if (size >= arr.length) {
	    expand();
	}
	
	arr[index] = e;
    }

    public T remove(Object o) {
	if (!contains(o)) {
	    return null;
	}
	
	Object[] newArray = new Object[arr.length];
	T element = null;
	
	int lastIndex = 0;
	
	for (int i = 0; i < size; i++) {
	    lastIndex++;
	    
	    if (o.equals(arr[i])) {
		size--;
		break;
	    }
	    
	    newArray[i] = arr[i];
	}
	
	for (int i = lastIndex; i < size; i++) {
	    newArray[i] = arr[i];
	}
	
	arr = (T[]) newArray;

	return element;
    }

    public void clear() {
	size = 0;
	arr = (T[]) new Object[2];
    }

    public T get(int index) {
	return arr[index];
    }

    public void set(int index, T element) {
	arr[index] = element;
	size++;
    }

    public void add(int index, T element) {
	size++;
	if (index >= arr.length) {
	    expand();
	}
	
	Object tmpArray[] = new Object[arr.length];
	
	if (arr[index] != null) {
	    for (int i = 0; i < arr.length; i++) {
		if (i < index) {
		    tmpArray[i] = arr[i];
		}
		else if (i == index) {
		    tmpArray[i] = element;
		}
		else if (i > index) {
		    tmpArray[i + 1] = arr[i];
		}
	    }
	}
	else {
	    arr[index] = element;
	}
    }

    public T remove(int index) {
	return null;
    }

    public int indexOf(Object o) {
	int index = -1;
	
	for (int i = 0; i < size; i++) {
	    if (arr[i] != null && arr[i].equals(o)) {
		index = i;
		break;
	    }
	}
	
	return index;
    }
    
    protected void expand() {
	T[] tempArray = (T[]) new Object[arr.length*2];
	
	//intentionally avoided Arrays.copyOf
	for (int i = 0; i < arr.length; i++) {
	    tempArray[i] = arr[i];
	}
	
	arr = tempArray;
    }
    
    public void printContents() {
	System.out.println("----");

	for (T item : arr) {
	    System.out.println(item);
	}
	
	System.out.println("----");
    }
}
