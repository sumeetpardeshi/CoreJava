package recursion;

//printing 10-1 without using any loop
public class TablesUsingRecursion {
	
	public static void main(String[] args) {
		
		int limit=10;
		
		process(limit);
		
		
		
	}
	
	public static void process(int val)
	{
		System.out.println();
		
		for(int cnt=1;cnt<10;cnt++)		
			System.out.print("\t"+val*cnt);
		
		if(val-->1)
			process(val);
	}
}


