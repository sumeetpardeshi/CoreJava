package classes;

public class MainClass {

	public static void main(String[] args) {
		Box _b01= new Box();
		System.out.println(_b01.volume());
	
		Box _b02= new Box(0b11111111,0xabcdef,00);
		System.out.println(_b02);
		
		
		
	}
		
}

