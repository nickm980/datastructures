package basic;

public class DataStructures {
    
    public static <T> void expand(T[] arr) {
	T[] tempArray = (T[]) new Object[arr.length*2];
	
	//intentionally avoided Arrays.copyOf
	for (int i = 0; i < arr.length; i++) {
	    tempArray[i] = arr[i];
	}
	
	arr = tempArray;
    }
}
