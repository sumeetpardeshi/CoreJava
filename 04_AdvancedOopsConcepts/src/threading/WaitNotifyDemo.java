package threading;

public class WaitNotifyDemo {
	public static void main(String[] args) {
	
		Q q= new Q();	//creating a common buffer queue for prod-consumer to read/write
		Thread producer= new Thread(new Producer(q));	
		
		Thread consumer= new Thread(new Consumer(q));
		
		producer.start();
		consumer.start();
		
		
		
		
	}
}
