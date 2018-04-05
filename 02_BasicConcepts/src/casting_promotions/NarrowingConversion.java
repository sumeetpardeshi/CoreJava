package casting_promotions;

public class NarrowingConversion {
public static void main(String[] args) {
	
	//int to byte conversion N Mod 256 as  (2^8) as byte is 8 bit 
	int i= 1000000;
	byte b= (byte)i;
	System.out.println(b);
	
	//int to short conversion N Mod 65535 as  (2^16) as short is 16 bit  
	i= 1000000;
	short s= (short)i;
	System.out.println(s);
	
}
}
