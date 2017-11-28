package overlading;

import classes.A;
import classes.B;

public class MethodOverriding {

	
	public static void main(String[] args) {
		A masterref;
		A aref= new A();
		B bref= new B();
		
		masterref=aref;
		masterref.show();	// calls show method of A
		
		masterref=bref;
		masterref.show(); 	// calls show method of B
	}
}
