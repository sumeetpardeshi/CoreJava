package threading;

public class Producer implements Runnable{
	Q q;
	 final static int LIMIT=10;
	
	 public Producer(Q q) {
		this.q=q;
	}
	
	int i;
	@Override
	public void run() {
		
		while(i<LIMIT)
			{try {
				q.put(i++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		
	}

}
