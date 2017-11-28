package loops;

public class ContinueAsGoto {
	public static void main(String[] args) {
		
		
		start:
		for(int i=1;i<10;i++)
		{
			System.out.println("start");
			for(int j=1;j<10;j++) {
				System.out.println(i+" "+j);
				if(i==j) continue start;
			}
		}
		
				
	}

}
