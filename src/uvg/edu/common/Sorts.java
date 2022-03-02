/**
 * 
 */
package uvg.edu.common;

import java.util.Arrays;
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
	
    private T getMax(T[] myArray){
    	T max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
        	if(compare.Compare(max, myArray[i]) == -1){
				max = myArray[i];
			}
        }
        return max;
    }
 

    
    private void countSort(T[] myArray, int exp){
    	Integer[] output = new Integer[myArray.length];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
        
		for (i = 0; i < myArray.length; i++) {	
			Integer value = (Integer) myArray[i];
			count[((value/ exp) % 10)]++;
		}
 
        for (i = 1; i < 10; i++) {        	
        	count[i] += count[i - 1];
        }
 
        for (i = myArray.length - 1; i >= 0; i--) {
        	Integer value = (Integer) myArray[i];
            output[count[((value / exp) % 10)] - 1] = (Integer) myArray[i];
            count[((value / exp) % 10)]--;
        }
        
        for (i = 0; i < myArray.length; i++)
        	myArray[i] =  (T) output[i];
    }
 

    public void radixsort(T[] myArray){

        Integer m = (Integer) getMax(myArray);
 
        for (int exp = 1;   m / exp > 0; exp *= 10) {        	
        	countSort(myArray, exp);
        }
    }
	
	
}
