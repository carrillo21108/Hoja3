/**
 * 
 */
package uvg.edu.common;

import java.util.Comparator;

/**
 * @author Brian Carrillo
 *
 */
public class Sorts<T> {
	public IComparator compare;
	
	public Sorts(IComparator compare) {
		this.compare = compare;
	}
	
	
	// Gnome Sort
	
	public void gnomeSort( T[] myArray){
        int i = 0;
        while (i < myArray.length) {
            if (i == 0) {            	
            	i++;
            }
            if(compare.Compare(myArray[i], myArray[i-1]) >= 0) {
            	i++;
            }else {
                T temp;
                temp = myArray[i];
                myArray[i] = myArray[i - 1];
                myArray[i - 1] = temp;
                i--;
            }
        }
        return;
    }
	
	
	// Merge Sort
	
	public void mergeSort(T[] myArray, int length) {
	    if (length < 2) {
	        return;
	    }
	    int mid = length / 2;
	    Integer[] l = new Integer[mid];
	    Integer[] r = new Integer[length - mid];

	    for (int i = 0; i < mid; i++) {
	        l[i] = (Integer) myArray[i];
	    }
	    for (int i = mid; i < length; i++) {
	        r[i - mid] = (Integer) myArray[i];
	    }
	    
	    mergeSort((T[]) l, mid);
	    mergeSort((T[]) r, length - mid);

	    merge(myArray, (T[])l, (T[])r, mid, length - mid);
	}
	
	private void merge(T[] myArray, T[] l, T[] r, int left, int right) {
	 
	    int i = 0, j = 0, k = 0;
	    while (i < left && j < right) {
	    	if(compare.Compare(l[i], r[j]) >= -1) {
	    		myArray[k++] = l[i++];
	    	}else {
	    		myArray[k++] = r[j++];
	        }
	    }
	    while (i < left) {
	    	myArray[k++] = l[i++];
	    }
	    while (j < right) {
	    	myArray[k++] = r[j++];
	    }
	} 
	
	
	//Radix Sort
	
	
	
	
}
