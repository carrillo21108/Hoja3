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
}
