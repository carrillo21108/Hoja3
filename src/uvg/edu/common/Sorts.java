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
	public void QuickSort(T[] myArray, int inf, int sup) {
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
	 	   QuickSort(myArray, inf, i - 1);
	 	   QuickSort(myArray, i + 1, sup);
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
