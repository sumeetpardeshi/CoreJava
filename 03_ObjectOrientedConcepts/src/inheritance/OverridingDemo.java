package inheritance;

import classes.A;
import classes.B;

public class OverridingDemo {
	public static void main(String[] args) {
		//new B().show();;
		
		A aobj= new B();	//dynamic method dispatch: superclass can hold subclass references
		
		
		aobj.show();
	
		System.out.println(aobj.number1);;		
		System.out.println(aobj.number2);;
		
		
		
	}
}
