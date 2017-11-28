package finalize_demos;

public class Child extends Parent{

	
	public Child() {
	System.out.println("Child::Constructor");
	}
	
	static public void print() {
		System.out.println("Parent::Print");		
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize of Child");

	}
	
}
