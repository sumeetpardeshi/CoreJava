package threading;

public class ThreadBasic {
	public static void main(String[] args) {
	
		Thread mainThread=Thread.currentThread();
		System.out.println(mainThread);
	
	
		//Creating Thread through Runnable Interface		
		Thread MyRunnableThread= new Thread(new CustomThreadUsingRunnableInterface());
		MyRunnableThread.start();

		//Creating Thread using Thread Interface
		Thread MyCustomThread= new CustomThreadUsingThreadClass();
		MyCustomThread.start();
			}
}
