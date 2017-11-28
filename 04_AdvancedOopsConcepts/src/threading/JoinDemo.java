package threading;

public class JoinDemo {
	public static void main(String[] args) {
	
		SlowCounterThread slow= new SlowCounterThread("SLOW");
		FastCounterThread fast= new FastCounterThread("FAST");
		//fast.setPriority(Thread.MAX_PRIORITY);	//IF we remove priority FAST and slow will get equal amount of CPU
		Thread mainThread= Thread.currentThread(); 
		
		
		try {
			slow.join();		//main waits for slow-thread to complete, slow also had dependency on other thread
			fast.join();		//main waits for fast-thread to complete
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Threads Started");
		slow.start();
		fast.start();
		
		
				
	}
}
