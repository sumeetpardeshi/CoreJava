package nested_classes;

public class InnerClassDemo {
	
	private int outvar1;
	
	public InnerClassDemo() {
		System.out.println("constructor Outer");
	}
	
	private void accessInner() {
		
		Inner i= new Inner();
		System.out.println(i.innervar++);;

		
	}
	
	
	class Inner{
		private int innervar;
		
		public Inner() {
			System.out.println("constructor Inner");
		}
	
		public void UserOuterData() {
			System.out.println("Inner accessing outervar:"+outvar1);
		}
	}
	
	
	public static void main(String[] args) {
		
		InnerClassDemo Outer= new InnerClassDemo();
		
		Outer.accessInner();
		System.out.println(Outer.outvar1);;
		
	}
	
}
