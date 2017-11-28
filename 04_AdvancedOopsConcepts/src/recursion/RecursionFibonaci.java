package recursion;
//	fibonacci
//	0 1 1 2 3 5 8 13

public class RecursionFibonaci {

 	static int lim=10;
	static void fib(int n1,int n2) 
	{	
		if(n2<lim) {		
			if(n1==0) 
				System.out.println("0");
	
			System.out.println(n2);		
			fib(n2,n1+n2);
		}
	}	
	
	public static void main(String[] args) {	
		fib(0,1);
	}
}
