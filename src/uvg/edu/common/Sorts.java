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
	
	
	//RadixSort
	public void RadixSort (int T[] , int n, int place) {
		int[] output = new int[n+1];  
	    int[] count = new int[10];  
	      
	      // Calculate count of elements   
	    for (int i = 0; i < n; i++)  
	    	count[(T[i] / place) % 10]++;  
	          
	      // Calculate cumulative frequency    
	    for (int i = 1; i < 10; i++)  
	    	count[i] += count[i - 1];  
	      
	      // Place the elements in sorted order    
	    for (int i = n - 1; i >= 0; i--) {  
	    	output[count[(T[i] / place) % 10] - 1] = T[i];  
	    	count[(T[i] / place) % 10]--;  
	      
	    }  
	        
	    for (int i = 0; i < n; i++)  
	    	T[i] = output[i];  
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
