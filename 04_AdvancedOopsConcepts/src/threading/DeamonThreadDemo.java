package threading;

/**
 * If Thread is deamon, when main thread ends, all threads will end
 * IF normal Thread, even if main thread finishes, all thread may continue 
 * */
public class DeamonThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread dt = new Thread(new DaemonThread(), "dt");
		//dt.setDaemon(true); //if set true waits for daemon to complete
		dt.start(); // continue program 
		Thread.sleep(3000); System.out.println("Finishing program");

		
	}
}
