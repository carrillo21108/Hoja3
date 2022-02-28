/**
 * 
 */
package uvg.edu.common;

import java.util.Comparator;

//import uvg.edu.test.T;

/**
 * @author Brian Carrillo
 *
 */
public class Sorts<T> {
	public IComparator compare;
	
	public Sorts(IComparator compare) {
		this.compare = compare;
	}
	
	
	//QuickSort
	public void QuickSort(int arr[], int begin, int end) {
	    if (begin < end) {
	        int partitionIndex = partition(arr, begin, end);

	        QuickSort(arr, begin, partitionIndex-1);
	        QuickSort(arr, partitionIndex+1, end);
	    }
	}
	
	private int partition(int arr[], int begin, int end) {
	    int pivot = arr[end];
	    int i = (begin-1);

	    for (int j = begin; j < end; j++) {
	        if (arr[j] <= pivot) {
	            i++;

	            int swapTemp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = swapTemp;
	        }
	    }

	    int swapTemp = arr[i+1];
	    arr[i+1] = arr[end];
	    arr[end] = swapTemp;

	    return i+1;
	}
	    
	
	//BubbleSort
	public void BubbleSort( T [] myArray) {
		for (int i = 0; i < myArray.length - 1; i++) {
			for(int j = 0; j < myArray.length; j++) {
				if(compare.Compare(myArray[i], myArray[j]) > 0) {
					T temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;
				}
			}
		}
		
	}
	
	
	
	
	
	
}
