package basic;

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class Stack<T> {

    int size;
    T[] array;
    
    public Stack() {
	array = (T[]) new Object[2];
	size = -1;
    }
    
    public boolean isEmpty() {
	return size < 0;
    }
    
    public void push(T element) {
	size++;
	
	if (size >= array.length) {
	    expand();
	}
	
	array[size] = element;
    }
    
    public T pop() {
	if (size < 0) {
	    throw new StackOverflowError("Not enough elements");
	}
		
	size--;

	T element = array[size + 1];
	array[size + 1] = null;

	return element;
    }
    
    protected void expand() {
	T[] tempArray = (T[]) new Object[array.length*2];
	
	//intentionally avoided Arrays.copyOf
	for (int i = 0; i < array.length; i++) {
	    tempArray[i] = array[i];
	}
	
	array = tempArray;
    }
}
