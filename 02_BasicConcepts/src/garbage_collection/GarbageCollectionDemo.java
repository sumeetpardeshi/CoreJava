package garbage_collection;

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
		
	}
}
