package threading;

public class CustomThreadUsingThreadClass extends Thread{

	public CustomThreadUsingThreadClass() {
		
	System.out.println("constructor-"+this.getName()+""+this.getState());	
		
	}
	
	@Override
	public void run() {
		System.out.println("CustomThread-started"+this.getState());
		super.run();
		System.out.println("CustomThread-ended"+this.getState());
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("CustomThread-finalize"+this.getState());
		super.finalize();
	}
}
