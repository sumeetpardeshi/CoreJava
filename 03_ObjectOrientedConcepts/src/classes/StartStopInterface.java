package classes;

public interface StartStopInterface {

	default void Start() {
		System.out.println("Start");
		A a = new A();
		a.show();
	}
	
	
}
