package overlading;

public class MethodOverloadingAutoboxing_1 {

	public static void main(String[] args) {
		
		method(10);		//integer primitives casted to Object
		method(1.2);	//double primitives casted to object				
	}

	static void method(Object x) {
		System.out.println("Object x");
	}
}
