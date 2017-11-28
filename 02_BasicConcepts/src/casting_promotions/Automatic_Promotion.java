package casting_promotions;

public class Automatic_Promotion {

	public static void main(String[] args) {
	
		//Type conversion (WIDENING)
		
		int x=12,y=13;
		float f= x+y;
		System.out.println(f);	//res: 25.0 //automatic conversion to destination
		
		//Casting (NARROWING)
		int intVariable=255;			
		byte byteVariable= (byte)intVariable;
		System.out.println("int to byte"+byteVariable);
		
		//when int converts to byte, 2's compliment is considered
		
		
		/*		
		//automatic promotion of BYTE
		byte byte1,byte2;
		byte result_add=byte1+byte2;	//all bytes converted to int automatically
		byte result_subtract=byte1-byte2;
		
		short short1,short2;
		short short_add=short1+short2;	//all short converted to int automatically
				
		char char1,char2;
		char result=char1+char2;		//all chars converted to int automatically
*/		
		
	}
	
}
