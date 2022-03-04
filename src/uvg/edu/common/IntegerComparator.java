/**
 * Class IntegerComparator
 * @version 1.0 02/03/2022
 *
 * 
 */

package uvg.edu.common;

import java.io.BufferedWriter;
import java.io.File;

public class IntegerComparator<T> implements IComparator<T> {

	/**
     * Metodo Compare: sirve para comparar dos objetos.
     * 
     * @see Integer#parseInt()
     * @param object1: (T)
     * @param object2: (T)
     * @return (int)
     * 
     */
	@Override
	public int Compare(T object1, T object2) {
		
		int num1 = Integer.parseInt(object1.toString());
		int num2 = Integer.parseInt(object2.toString());
		
		if(num1>num2) {
			return 1;
		}else if(num1<num2) {
			return -1;
		}else {
			return 0;
		}
	}

}
