package overlading;

public class MethodOverloading {
	public static void main(String[] args) {
		
System.out.println(greet("Sumeet"));
		
	}
	
	static String greet() {
		return "Hello User";
	}

	//static int greet() {}			gives error coz same function exists
									
	
	static String greet(String username)
	{
		return "Hello "+username;
	}
	
	

}
