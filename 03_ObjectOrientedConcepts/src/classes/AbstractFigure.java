package classes;

abstract public class AbstractFigure {
	
	public AbstractFigure() {
	System.out.println("Abstract class can have constructors");
	}
	abstract public void calculateVolume() ;
	
	private A a= new A();	//unlike default interfaces abstract class
							//can contain a state 
		
	
	public void display() {
		System.out.println("NormalMethod in abstract class");

	}
}
