package nested_classes;

//static inner class 
public class StaticNestedClassesDemo {
	
	public StaticNestedClassesDemo() {
		System.out.println("OuterConstructor");
	}
	
	private void outerMethod() {
		System.out.println("Outer method called");
		System.out.println("accessing inner static variable"+InnerClass.innerStaticVar);;
		
		InnerClass.processInner();

	}
	
	//class needs to be declared as static inorder to use static variables,block and functions
	static class InnerClass{
		static int innerStaticVar;
		int innerNormalVar;
		static {
			innerStaticVar=10;
			System.out.println("Inner-Static block");
		}
	
		public static void processInner() {
			
			System.out.println("Inner-static method-processInner()");
		}
	}
	
	public static void main(String[] args) {
		
		
		StaticNestedClassesDemo outer= new StaticNestedClassesDemo();
		outer.outerMethod();
	}
}
