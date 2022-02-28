/**
 * 
 */
package uvg.edu.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import uvg.edu.common.IntegerComparator;
import uvg.edu.common.Sorts;

import org.junit.jupiter.api.Test;

/**
 * @author Brian Carrillo
 *
 */
class SortsTest {

	@Test
	void GnomeSortTest() {
		
	}
	
	@Test
	void MergeSortTest() {
		
	}
	
	@Test
	void QuickSortTest() {
		Sorts sorts = new Sorts(new IntegerComparator());
		Integer[] myArray = new Integer[4];
		myArray[0] = 4;
		myArray[1] = 2;
		myArray[2] = 6;
		myArray[3] = 1;
		
		sorts.QuickSort(myArray, 0, myArray.length -1); 
		
		assertEquals(myArray[0], 1);
		assertEquals(myArray[1], 2);
		assertEquals(myArray[2], 4);
		assertEquals(myArray[3], 6);
		
	}
	
	@Test
	void RadixSortTest() {
		
	}
	
	@Test
	void BubbleSortTest() {
		Sorts sorts = new Sorts(new IntegerComparator());
		Integer[] myArray = new Integer[4];
		myArray[0] = 1;
		myArray[1] = 7;
		myArray[2] = 2;
		myArray[3] = 3;
		
		sorts.BubbleSort(myArray);
		assertEquals(myArray[0], 1);
		assertEquals(myArray[1], 2);
		assertEquals(myArray[2], 3);
		assertEquals(myArray[3], 7);
		
	}


}
