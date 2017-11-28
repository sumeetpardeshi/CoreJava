package overlading;

import classes.Box;

//primitives passed by value
//custom objects passed by reference

//Cant use String, Integer, Float, Double, Byte etc. for pass by reference as they are immutable
public class PassbyvaluePassbyreference {
	public static void main(String[] args) {
		
		//Pass By Value
		int x=100,y=200;
		process(x,y);
		System.out.println("x:"+x +" y:"+y);
		
		Integer _x=100,_y=200;
		process(_x,_y);	//Integer wont pass as reference as they are immutable
		System.out.println("_x:"+_x +" _y:"+_y);
	
		//Custom Objects Pass By Reference
		Box b= new Box();
		process(b);				//b object passed as reference
		System.out.println(b);	//values of b are changed by process method
	}
	
	static void process(int x, int y)
	{
			System.out.println("int");
			x++;y++;			
	}
	static void process(Integer x, Integer y)
	{
			System.out.println("Integer");
			x++;y++;
	}
	static void process(Box test)
	{
		test.setHeight(test.getHeight()+1);
		test.setWidth(test.getWidth()+1);
		test.setBreadth(test.getBreadth()+1);
		
	}

}
