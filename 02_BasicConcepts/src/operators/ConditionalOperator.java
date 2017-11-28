package operators;

public class ConditionalOperator {
	
	public static void main(String[] args) {
		
		byte input=10,denom=0;
		
		//	(expression)?(expression_true):(expression_false)
		int res= denom==0?0:input/denom;
		
		System.out.println(res);
		
		
	}

}
