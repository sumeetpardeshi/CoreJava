package inheritance;

import classes.A;
import classes.B;

public class OverridingDemo {
	public static void main(String[] args) {
		//new B().show();;
		
		A aobj= new B();	//dynamic method dispatch: superclass can hold subclass references
		
		
		aobj.show();		//method of B called 
	
		System.out.println(aobj.number1);;	//though reference to B but shows value of A only 		
		System.out.println(aobj.number2);;	//though reference to B but shows value of A only
		
		
		
	}
}
