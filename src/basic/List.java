package basic;

import basic.interfaces.IList;

public class List<T> implements IList<T> {

    T arr[];
    int size;
    
    public List(){
	this.arr = (T[]) new Object[2];
	this.size = 2;
    }
    
    public int size() {
	return this.size;
    }

    public boolean isEmpty() {
	return size < 0;
    }

    public boolean contains(Object o) {
	return this.indexOf(o) != -1;
    }

    public void add(T e) {
	int index = size + 1;
	
	if (size >= arr.length) {
	    expand();
	}
	
	arr[index] = e;
    }

    public T remove(Object o) {
	if (!this.contains(o)) {
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
	
	this.arr = (T[]) newArray;

	return element;
    }

    public void clear() {
	this.arr = (T[]) new Object[2];
    }

    public T get(int index) {
	return this.arr[index];
    }

    public void set(int index, T element) {
	this.arr[index] = element;
    }

    public void add(int index, T element) {
	if (index >= arr.length) {
	    expand();
	}
	Object tmpArry[] = new Object[arr.length];
	
	if (arr[index] != null) {
	    for (int i = 0; i < arr.length; i++) {
		
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
}
