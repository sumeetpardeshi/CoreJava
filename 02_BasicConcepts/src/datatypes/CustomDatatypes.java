package datatypes;

public class CustomDatatypes {
	public static void main(String[] args) {

		int[] list = {10,20,30,40};
		
		//int[] is a reference and not primitive 
		System.out.println(list.getClass().isPrimitive());
		System.out.println(list.getClass().getName());;
		
		
//				[Z = boolean
//				[B = byte
//				[S = short
//				[I = int
//				[J = long
//				[F = float
//				[D = double
//				[C = char
//				[L = array of any non-primitives(Object)
//				all this classes are at same level of hierarchy		
	}
}
