package arrays;

import java.util.Arrays;

public class OneDimensional {

	public static void main(String[] args) {
	
		int myArray[];	//array just declared, no memory allocated
		
		
		myArray=new int[5];
		
		int [] list=new int[10]; 	//by default initialized to zero 0
		
		for (int x = 0; x < list.length; System.out.println(list[x++]));

		Arrays.fill(list, 100);			
		for (int x = 0; x < list.length; System.out.println(list[x++]));
		
		
		int [] array1_,array2_,array3_;	//creating 3 arrays
		
		int [] array1,array2,array3[];	//creating 3 arrays
		
		
		
	}
	

}
