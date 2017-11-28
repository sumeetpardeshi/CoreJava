package overlading;

public class MethodOverloadingAutoboxing {

	public static void main(String[] args) {
		
		method(10);		//primitive preffered over Class Integer
		method(1.2);	//Autoboxed to Double class		
		
		Byte bytevar= new Byte("127");
		
		method(bytevar);	//byte 
	}

	static void method(int x){
		System.out.println("int x");
	}
	
	static void method(Integer x) {
		System.out.println("Integer x");
	}
	
	static void method(Double x) {
		System.out.println("Double x");
	}
	
}
