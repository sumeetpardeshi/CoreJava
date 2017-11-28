package finalize_demos;

public class Client {
	public static void main(String[] args) {
	
		Parent parent= new Child();
		parent.print();
		
		parent=null;
		System.gc();

		System.out.println(System.getenv().get("USERNAME"));
		
		String [][][][]str= { { { { "RED", "GREEN", "BLUE" }, 
			{ "GREEN", "RED", "BLUE" } }, 
				{ { "ORANGE", "GREEN", "WHITE" }, 
				{ "BLACK", "INDIGO", "BLUE" } } }, 
				{ { { "SKY BLUE", "ALMOND", "AQUA" 
				}, 
				{ "APPLE GREEN", "PINK", "BLUE GREEN" } }, 
				{ { "VIOLET", "BRASS", "GREY" }, 
				{ "BROWN", "INDIGO", "CHERRY" } } } 
				}; 
		
		System.out.println(str[0][1][0][1]);
		System.out.println(str[1][1][1][2]);
		
	}
}
