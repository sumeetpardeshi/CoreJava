package threading;

public class FastCounterThread extends Thread{
	public FastCounterThread(String str) {
		super(str);
	}
	
	public FastCounterThread() {
		super();
	}
	
	public void run() {
		try {
			for(int i=0;i<5;this.sleep(500),i++)
				System.out.println(this.getName()+":"+this.getPriority()+":"+this.getState()+""+i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
