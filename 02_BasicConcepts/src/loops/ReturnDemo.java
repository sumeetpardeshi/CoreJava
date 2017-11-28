package loops;

public class ReturnDemo {
	public static void main(String[] args) {
	
		System.out.println("Test1");
		 if(true) return;		//returns control to the caller ie. exits main.
		 						//without if(true) it would give compile time error.
		System.out.println("Test2"); 
	}
}
