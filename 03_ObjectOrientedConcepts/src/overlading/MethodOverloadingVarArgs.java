package overlading;
//varArgs means 0..n parameters
public class MethodOverloadingVarArgs {
	public static void main(String[] args) {
	Integer i=10;	
		
		//functions with primitives get precedence over functions with vararg.
		//so int,int will get precedence over int...vararg 
		func(i,i);
		aMethod(2,2);
		//funct();		//COMPILE TIME ERROR- as cannot resolve the correct 
		aMethod(); 	//varArg methods can have no parameters
	}
	
	static void func(int num1,int num2) {System.out.println("integer Function");}
	
	static void func(int...numlist) {System.out.println("Varargs Function");}
	
	static void func(int i, int...numlist) {};	//COMPILE TIME ERROR- when try to use func(10); it will cause ambiguity	
	
	
	 protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	static void aMethod (int... b)
	  {
	    System.out.println("byte, byte");
	  }
	 
	  static void aMethod (int b, int c)
	  {
	    System.out.println("int, int");
	  }
}
