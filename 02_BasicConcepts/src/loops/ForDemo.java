package loops;

public class ForDemo {

	public static void main(String[] args) {
	
		String[] args1= {"Sum"};
		
		for (int i = 0; i < args1.length; i++)
			System.out.println(args1[i]);	
		
			
		for(int i=0;i<5;i++)
		{
			System.out.println("hello");
			continue;
		}
		
		//for (init_stmt1,init_stmt2 ; boolean condition ; iteration_stmt1, iteration_stmt2)
		for(int i=0;i<5;System.out.println("googly"+i++),System.out.println("-"+i));
			
		
		for(int i=0,j=10;i<=j;System.out.print(i++),System.out.println(" "+j--));
				
		int [] numArray= {0,1,2,3,4,5,6,7,8,9,10};
		
		for (int i : numArray) {
			System.out.println(i);
		}
				
	}

}
