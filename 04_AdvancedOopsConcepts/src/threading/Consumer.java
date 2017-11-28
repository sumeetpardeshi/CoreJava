package threading;

public class Consumer implements Runnable{
int i;
Q q;
	public Consumer(Q q) {
	 this.q=q;	
	}
	@Override
	public void run() {
		while(true)
		{
			try {
				q.get();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	}

}
