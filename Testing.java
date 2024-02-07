import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Testing {

	@Test
	void testMergeSort() {
		Integer[] numbers = {9,30,10,4};
		
		MergeSort<Integer> sort = new MergeSort<>();
		sort.mergeSort(numbers);
		
		
		assertEquals(4, numbers[0]);
	}
	@Test 
	void testMergeSort3() {
		Integer[] numbers = {9,30,10,4};
		
		MergeSort<Integer> sort = new MergeSort<>();
		sort.mergeSort(numbers);
		
		
		assertEquals(10, numbers[2]);
		
	}
	@Test 
	void testMergeSort4() {
		Integer[] numbers = {9,30,10,4};
		
		MergeSort<Integer> sort = new MergeSort<>();
		sort.mergeSort(numbers);
		
		
		assertEquals(9, numbers[1]);
		
	}
	
	@Test
	void testMergeSort2() {
		Integer[] numbers = {9,30,10,4};
		
		MergeSort<Integer> sort = new MergeSort<>();
		sort.mergeSort(numbers);
		
		
		assertEquals(30, numbers[3]);
		
	}
	
	@Test
	void testQuickSort() {
		Integer[] numbers = {9,30,10,4};
		
		QuickSort<Integer> sort = new QuickSort<>();
		sort.quickSort(numbers, 0, numbers.length - 1);
		assertEquals(4, numbers[0]);
	}
	@Test
	void testQuickSort2() {
		Integer[] numbers = {9,30,10,4};
		
		QuickSort<Integer> sort = new QuickSort<>();
		sort.quickSort(numbers, 0, numbers.length - 1);
		assertEquals(30, numbers[3]);
	}
	

}
