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
	
	private void merge(T[] myArray, int l, int m, int r){

	    int n1 = m - l + 1;
	    int n2 = r - m;

	    Integer[] L = new Integer[n1];
	    Integer[] R = new Integer[n2];

	    for (int i = 0; i < n1; ++i)
	        L[i] = (Integer) myArray[l + i];
	    for (int j = 0; j < n2; ++j)
	        R[j] = (Integer) myArray[m + 1 + j];


	    int i = 0, j = 0;

	    int k = l;
	    while (i < n1 && j < n2) {
	        if (L[i] <= R[j]) {
	        	myArray[k] = (T) L[i];
	            i++;
	        }
	        else {
	        	myArray[k] = (T) R[j];
	            j++;
	        }
	        k++;
	    }

	    while (i < n1) {
	    	myArray[k] = (T) L[i];
	        i++;
	        k++;
	    }

	    while (j < n2) {
	    	myArray[k] = (T) R[j];
	        j++;
	        k++;
	    }
	}

	public void mergeSort( T[] myArray, int l, int r){
	    if (l < r) {
	        int m =l+ (r-l)/2;

	        mergeSort(myArray, l, m);
	        mergeSort(myArray, m + 1, r);

	        merge(myArray, l, m, r);
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
 

    public void radixSort(T[] myArray){

        Integer m = (Integer) getMax(myArray);
 
        for (int exp = 1;   m / exp > 0; exp *= 10) {        	
        	countSort(myArray, exp);
        }
    }
    
    
    //Quick Sort
    
    public void quickSort(T[] myArray, int inf, int sup) {
        int i = inf -1;
        int j = sup;
        boolean flag = true;
        T temp;
        
        if (inf >= sup) {
 		   return;
 	   }
 	   
 	   T elem_div = myArray[sup];
 	   
 	   
 	   while (flag) {
 		   while(compare.Compare(myArray[++i], elem_div) < 0); //Move the index i until it finds an element bigger than elem_div
 		   while((compare.Compare(myArray[--j], elem_div) > 0) && (j > inf)); //Move the index j until it finds element smaller than elem_div
 		   
 		   if (i < j) {
 			   temp = myArray[i];
 			   myArray[i] = myArray[j];
 			   myArray[j] = temp;
 		   } else {
 			   flag = false;
 		   }
 	   }
 	   
 	   temp = myArray[i];
 	   myArray[i] = myArray[sup];
 	   myArray[sup] = temp;
 	   quickSort(myArray, inf, i - 1);
 	   quickSort(myArray, i + 1, sup);
    }

    

	//Bubble Sort
	public void bubbleSort( T[] myArray) {
		for (int i = 0; i < myArray.length - 1; i++) {
			for(int j = i + 1; j < myArray.length; j++) {
				if(compare.Compare(myArray[i], myArray[j]) > 0) {
					T temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;
				}
			}
		}
		
	}
	
}
