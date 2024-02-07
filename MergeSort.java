import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> {
	
	
	public T[] mergeSort(T[] arr) {

		int len = arr.length;

		if (len > 1) {
			int midpoint = len / 2;

			// split the array into two

			T[] leftArray = Arrays.copyOfRange(arr, 0, midpoint);
			T[] rightArray = Arrays.copyOfRange(arr, midpoint, len);

			// Recursively sort the two halves

			mergeSort(leftArray);
			mergeSort(rightArray);

			// merge the sorted halves

			mergeArrays(arr, leftArray, rightArray);

		}

		return arr;

	}

	public void mergeArrays(T[] arr, T[] leftArray, T[] rightArray) {
	    int left = leftArray.length;
	    int right = rightArray.length;

	    int i = 0, j = 0, k = 0;

	    while (i < left && j < right) {
	        if (leftArray[i].compareTo(rightArray[j]) <= 0) {
	            arr[k] = leftArray[i];
	            i++;
	        } else {
	            arr[k] = rightArray[j];
	            j++;
	        }
	        k++;
	    }

	    // Copy remaining elements of leftArray, if any
	    while (i < left) {
	        arr[k] = leftArray[i];
	        i++;
	        k++;
	    }

	    // Copy remaining elements of rightArray, if any
	    while (j < right) {
	        arr[k] = rightArray[j];
	        j++;
	        k++;
	    }
	}
}