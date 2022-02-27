/**
 * 
 */
package uvg.edu.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import uvg.edu.common.IntegerComparator;
import uvg.edu.common.Sorts;

/**
 * @author Brian Carrillo
 *
 */
class SortsTest {

	@Test
	void GnomeSortTest() {
		
		Sorts sorts = new Sorts(new IntegerComparator());
		
		Integer[] myArray = new Integer[4];
		myArray[0] = 4;
		myArray[1] = 2;
		myArray[2] = 1;
		myArray[3] = 3;
		
		sorts.gnomeSort(myArray); 
		
		assertEquals(myArray[0], 1);
		assertEquals(myArray[1], 2);
		assertEquals(myArray[2], 3);
		assertEquals(myArray[3], 4);
		
	}
	
	@Test
	void MergeSortTest() {
		
		Sorts sorts = new Sorts(new IntegerComparator());
		Integer[] myArray = new Integer[4];
		myArray[0] = 4;
		myArray[1] = 2;
		myArray[2] = 1;
		myArray[3] = 3; 
		
		sorts.gnomeSort(myArray);
		
		assertEquals(myArray[0], 1);
		assertEquals(myArray[1], 2);
		assertEquals(myArray[2], 3);
		assertEquals(myArray[3], 4);
		
	}
	
	@Test
	void RadixSortTest() {
		
	}
	
	@Test
	void QuickSortTest() {
		
	}
	
	@Test
	void BubbleSortTest() {
		
	}


}
