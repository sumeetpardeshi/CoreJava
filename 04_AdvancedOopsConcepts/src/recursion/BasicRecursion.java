package recursion;

//printing 10-1 without using any loop
public class BasicRecursion {
	static int variable=10;
	public static void main(String[] args) {		
		System.out.println(variable);
		if(--variable>0) main(null);
	}
}


