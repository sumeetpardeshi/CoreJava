package finalize_demos;

public class Parent {

	public Parent() {
		System.out.println("Parent::Constructor");
	}
	
	public static void print() {
		System.out.println("Parent::Print");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize of Parent");
	}
}
