package threading;

public class SynchronizedDemo extends Thread{
	
	public SynchronizedDemo(String str) {
		super(str);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void run() {
			
		new UtilityShow().show();;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1=new SynchronizedDemo("ABC");
		t1.start();
		Thread t2=new SynchronizedDemo("EFG");
		t2.start();
		Thread t3=new SynchronizedDemo("HIJ");		
		t3.start();
		//t1.join();
		//t2.join();
		//t3.join();
		
		
	}
}


