package garbage_collection;

import java.util.ArrayList;
import java.util.Collection;

public class GarbageCollectionDemo {
	public static void main(String[] args) {
		
		//create OutOfMemoryError
		
		//way1
		int init=10;
		for(;;init*=10)
		{
			int []array= new int[init];
			
		}
		
		//way2
		long[] longArray= new long[Integer.MAX_VALUE];
		
		
		//way 3  java.lang.OutOfMemoryError: Java heap space
		Collection<Integer> c= new ArrayList<>();
		for(int i=0;i<Integer.MAX_VALUE;i++)
			c.add(i);
		
	}
}
