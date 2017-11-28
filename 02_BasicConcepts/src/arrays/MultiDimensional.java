package arrays;

public class MultiDimensional {
	public static void main(String[] args) {
		
		int []multiarray[]= {{10,20},{20,30,40},{10,10}};
		
		for (int i = 0; i < multiarray.length;i++) {
			for (int j = 0; j < multiarray[i].length; j++) {
				System.out.print("\t"+multiarray[i][j]);
			}
		System.out.println();	
		}
		
		
		int multiarray_[][]= new int[3][];  //inital capacity is compulsory, else compile error.
		multiarray_[0]= new int[10];
		multiarray_[1]= new int[5];
		multiarray_[2]= new int[10];
		

		
	}
	

}
