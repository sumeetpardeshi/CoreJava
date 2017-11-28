package loops;

public class BreakAsGoto {
	public static void main(String[] args) {
		
		int i=0,temp=10;
		
		start:
		do {
				System.out.println(i++);			
				if(i%5==0) break start;
			}while(true);
		
		
		/*label must be adjoining the loop,
		 *no statement allowed in between label and loop
		 */
		nextt:
		//	System.out.println("before for:");
		for(;;) {
			System.out.println("Test");
			break nextt;
			
		}
		
		
			
		
		
	}

}
