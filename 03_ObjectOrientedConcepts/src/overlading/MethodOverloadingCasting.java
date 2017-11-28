package overlading;


//widening preffered over Automboxing (prefers int over Integer)
//Java by default treats [integer literals int] and [floating point literals double]

public class MethodOverloadingCasting {
	public static void main(String[] args) {
		
		System.out.println(add(127,127));

		// if number passed, int method called 
		// if decimal passed, double method called
	
		int b=10;
		method(b);	//int converted to long
		
		
	}
	
	static int add(byte num1,byte num2){
		System.out.println("byte param function"+(num1+num2));
		return num1+num2;
	}

	static int add(short num1,short num2){
		System.out.println("short param function"+(num1+num2));		
		return num1+num2;
	}
	
	static int add(int num1,int num2){
		System.out.println("int param function");
		return num1+num2;
	}
	
	static double add(double num1,double num2){ 
		System.out.println("byte param function");
		return num1+num2;
	}
	
	static void method(long l)
	{
		System.out.println("method (long l)");
	}
}
