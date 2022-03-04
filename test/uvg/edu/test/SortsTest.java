/**
 * 
 */
package uvg.edu.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import uvg.edu.common.IntegerComparator;
import uvg.edu.common.Sorts;

/**
 * @author Carlos Lopez
 * @author Jennifer Toxcon
 *
 */
class SortsTest {
	
	//Pruebas de GnomeSort
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
	
	//Pruebas de MergeSort
	@Test
	void MergeSortTest() {
		
		Sorts sorts = new Sorts(new IntegerComparator());
		Integer[] myArray = new Integer[4];
		myArray[0] = 4;
		myArray[1] = 2;
		myArray[2] = 1;
		myArray[3] = 3; 
		
		sorts.mergeSort(myArray,0,myArray.length-1);
		
		assertEquals(myArray[0], 1);
		assertEquals(myArray[1], 2);
		assertEquals(myArray[2], 3);
		assertEquals(myArray[3], 4);
		
	}
	
	//Pruebas de RadixSort
	@Test
	void RadixSortTest() {
		
		Sorts sorts = new Sorts(new IntegerComparator());
		Integer[] myArray = new Integer[13];
		myArray[0] = 13;
		myArray[1] = 12;
		myArray[2] = 11;
		myArray[3] = 10; 
		myArray[4] = 9;
		myArray[5] = 8;
		myArray[6] = 7;
		myArray[7] = 6; 
		myArray[8] = 5;
		myArray[9] = 4;
		myArray[10] = 3;
		myArray[11] = 2;
		myArray[12] = 1; 
		
		
		sorts.radixSort(myArray);		
		
		assertEquals(myArray[0], 1);
		assertEquals(myArray[1], 2);
		assertEquals(myArray[2], 3);
		assertEquals(myArray[3], 4);
		assertEquals(myArray[4], 5);
		assertEquals(myArray[5], 6);
		assertEquals(myArray[6], 7);
		assertEquals(myArray[7], 8);
		assertEquals(myArray[8], 9);
		assertEquals(myArray[9], 10);
		assertEquals(myArray[10], 11);
		assertEquals(myArray[11], 12);
		assertEquals(myArray[12], 13);
	}
	
	//Pruebas de QuickSort
	@Test
	void QuickSortTest() {
		Sorts sorts = new Sorts(new IntegerComparator());
		Integer[] myArray = new Integer[4];
		myArray[0] = 4;
		myArray[1] = 2;
		myArray[2] = 6;
		myArray[3] = 1;
		
		sorts.quickSort(myArray, 0, myArray.length -1); 
		
		assertEquals(myArray[0], 1);
		assertEquals(myArray[1], 2);
		assertEquals(myArray[2], 4);
		assertEquals(myArray[3], 6);
	}
	
	//Pruebas de BubbleSort
	@Test
	void BubbleSortTest() {
		Sorts sorts = new Sorts(new IntegerComparator());
		Integer[] myArray = new Integer[4];
		myArray[0] = 1;
		myArray[1] = 7;
		myArray[2] = 2;
		myArray[3] = 3;
		
		sorts.bubbleSort(myArray);
		assertEquals(myArray[0], 1);
		assertEquals(myArray[1], 2);
		assertEquals(myArray[2], 3);
		assertEquals(myArray[3], 7);
		
	}


}
