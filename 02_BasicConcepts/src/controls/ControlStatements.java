package controls;

//Difference between switch and if-else ladder
//switch more efficient , cause compiler creates "jump table"

public class ControlStatements {
	public static void main(String[] args) {
	
		String input="Sum__t";
		
		//switches based on BOOLEAN VALUE of expression 
		if(input.contains("me"))
			System.out.println("contains me");
		else if(input.contains("mi"))
			System.out.println("contain mi");
		else 
			System.out.println("doenst contain 'me' or 'mi'");
		
		
		//switches on VALUE of expression, value cant be boolean
		//switch(input.contains("me"))	cant give boolean o/p
		switch(input)
		{
		case "Sumeet":
			System.out.println("contains me");
			break;
		//case "Sumeet":		duplicate case not allowed, compile error
		case "Sumit":
			System.out.println("contains mi");
			break;
		default:	
			System.out.println("doenst contain 'me' or 'mi'");
		
		}
			
	}
}
