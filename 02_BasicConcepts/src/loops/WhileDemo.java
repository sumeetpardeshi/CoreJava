package loops;

//used when you want condition checking first then processing
public class WhileDemo {

	public static void main(String[] args) {
		
		byte num1=0,num2=12;
		
		while(num1<num2) 
		System.out.println(++num1);

		num1=0;
		
		//body can be null
		while(++num1<--num2);
		System.out.println("Midpoint:"+num1);
	}

}
