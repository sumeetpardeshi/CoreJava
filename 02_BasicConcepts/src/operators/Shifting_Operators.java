package operators;

public class Shifting_Operators {
public static void main(String[] args) {
	
	byte byteVariable= 0b0000100;;
	//left shift - multiply by 2
	System.out.println(byteVariable+ " - "+(byteVariable<<1) );
	
	//right shift - divide by 2			//also termed as signed right shift
	System.out.println(byteVariable+" - "+(byteVariable>>1));

	//unsigned right shift (zero inserted to left)
	int intVariable=0b11111111111111111111111111111111;
	System.out.println(intVariable+" - "+(intVariable>>2)+" "+(intVariable>>>2));
	// >> causes error due to sign preserved
	// >>> causes sign to discarded and shift

}
}
