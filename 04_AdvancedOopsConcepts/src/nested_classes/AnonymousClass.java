package nested_classes;

public class AnonymousClass {

	interface fly{
		public void takeoff() ;
		public void land();
	}
	
	
	//anonymous implementation of seaPlane 
	static fly seaPlane= new fly() {
		public void takeoff() {
			System.out.println("sea plane takeoff");
		}
		public void land() {
			System.out.println("sea plane landing");		
		}
	};
	
	//anonymous implementation of landPlane
	static fly landPlane= new fly() {
		public void takeoff() {
			System.out.println("land plane takeoff");
		}
		public void land() {
			System.out.println("land plane landing");
		}
		
	};
	
	
	

	public static void main(String[] args) {
		
		AnonymousClass.seaPlane.takeoff();
		AnonymousClass.seaPlane.land();
		
		AnonymousClass.landPlane.takeoff();
		AnonymousClass.landPlane.land();
	}
	
}
