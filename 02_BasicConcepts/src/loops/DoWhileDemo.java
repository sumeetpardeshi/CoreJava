package loops;

import java.io.IOException;
import java.util.Scanner;

//used when you need menu behaviour, display first and then check condition
public class DoWhileDemo {
	public static void main(String[] args) throws IOException {
		
		char c;
		int input;
		Scanner in=new Scanner(System.in);
	
		
		
		do{
			
			System.out.println("MENU"
					+ "\n0.\tEXIT"
					+ "\n1.\tMENU_ITEM_1"
					+ "\n2.\tMENU_ITEM_2\n:>");

				input=in.nextInt();
			System.out.println(input);
			
		}while(input!=0);
		
		System.out.println("exit");
		
	}
}
