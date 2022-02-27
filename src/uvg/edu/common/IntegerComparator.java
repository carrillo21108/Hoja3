package uvg.edu.common;

public class IntegerComparator<T> implements IComparator<T> {

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
