package exception_handling;

public class CustomExceptionUsingThrowable extends Throwable{

	private static final long serialVersionUID = 1L;
	public CustomExceptionUsingThrowable() {
		this.initCause(new NullPointerException("nullpointr"));
	}
	@Override
	public String getMessage() {
		System.out.println("LOG-inside-Custom Exception");
		return super.getMessage();
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("CUSTOM");
	}
	
}
