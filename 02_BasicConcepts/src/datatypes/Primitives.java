package datatypes;

/*
 * All primitives have to be initialized
 * if no value initialized, it gives compile time error
*/

public class Primitives {

	public static void main(String[] args) {		
		
		// INTEGER ////////////////////////////////
		
		//byte 8bit	-128 to 127
		byte byteVariable=10/3;
		System.out.println(byteVariable);

		//specifying byte 
		byte byteInitializedVariable=0b111_1111;
		System.out.println("byte:"+byteInitializedVariable);
	
		byte octal=07;				//allowed as number prefixed by 0 are octal numbers
		//byte octal1=08;			will cause compile error as octal values are from 00-07
		System.out.println("octal:"+octal);
		
		byte hexa=0xF;
		System.out.println("hexa:"+hexa);
		
		
		//short 16bit -32768 to 32767
		short shortVariable= 32_______767;
		System.out.println(shortVariable);
		
		//int  32bit
		//long 64bit
		
		float floatVariable=10/3f;
		System.out.println(floatVariable);
		
		double doubleVariable=10.0/3.0d;			// 943_477_867.11_0_1
		System.out.println(doubleVariable);
		
		// CHAR  ////////////////////////////////
		
		char charVariable='S';
		System.out.println(charVariable);
		System.out.println(0+charVariable);	//convert char to integer value
		
		
		// BOOLEAN  ////////////////////////////////
		
		boolean booleanVariable=10!=(11-1);
		System.out.println(booleanVariable);
		
		
		
	}

}
