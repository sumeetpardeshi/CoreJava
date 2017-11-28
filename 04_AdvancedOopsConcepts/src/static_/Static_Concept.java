package static_;

public class Static_Concept {
	public Static_Concept() {
		System.out.println("Constructor");
	}
	static private int counter;
	
	//can have as many static block as required
	static {
		System.out.println("before increment-"+counter);
		System.out.println("static block 1");
		counter++;											//can easily access static variables
		System.out.println("after increment-"+counter);		
	}
	static {
		System.out.println("before increment-"+counter);
		System.out.println("static block 2");
		counter++;
		System.out.println("after increment-"+counter);
	}
	
	public void multiply(int count) {
	Static_Concept.counter*=count;
	}
	
	public static void main(String[] args) {
	
		Static_Concept obj1= new Static_Concept();
		obj1.multiply(5);
		System.out.println(Static_Concept.counter);
		Static_Concept obj2= new Static_Concept();
		obj2.multiply(5);
		System.out.println(Static_Concept.counter);		
		
	}

}
