package operators;

public class Logical_Operator {
/*
 * &	- non-short-circuit fair operator ()
 * &&	- short-circuit practical operator
 */
	
	public static void main(String[] args) {
	
		int denom=0,num=2;
		
		//& is fair operator, believes in fairness
		//& executes both operands irrespective of first result
		if(denom!=0&num/denom>10) 	//causes runtime error when denom=0
			System.out.println("true");
		else
			System.out.println("false");

		//&& is practical
		//&& excutes first operand, if its false no need to go fwd
		if(denom!=0&&num/denom>10) 	//will not execute second operand  when denom=0
			System.out.println("true");
		else
			System.out.println("false");

}
	
}
