
public class QuickSort<T extends Comparable<T>> {
	
	
	
	public T[] quickSort(T[] arr, int low, int high) {
		
		if(low < high) {
			int pivotIndex = partition(arr, low, high); 
			
			
			//recursively call quickSort
			quickSort(arr, low, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, high);
		}
		
		return arr;

	}

	public int partition(T[] arr, int low, int high) {
		
		T pivot = arr[high];
		
		int i = (low - 1); //-1
		
		for(int j = low; j <= high - 1; j++) {
			if(arr[j].compareTo(pivot) <= 0) {
				i++;
				
				//swap arr[i]  with arr[j] because j < i
				
				T temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
		}
		
		 // Swap array[i+1] and array[high] (pivot)
        T temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
	}
}
