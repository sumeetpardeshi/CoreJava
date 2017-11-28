package threading;

public class SlowCounterThread extends Thread{

	public SlowCounterThread() {
		super();
	}
	public SlowCounterThread(String str) {
		super(str);
	}
	
	@Override
	public void run() {
		super.run();
		try {
			
			Thread dependency=new Thread(new CustomThreadUsingRunnableInterface(),"DEPENDENCY");
			dependency.start();	//start dependency thread
			dependency.join();	//wait for it to complete
			for(int i=0;i<5;this.sleep(1000),i++)
			{				
				System.out.println(this.getName()+":"+this.getPriority()+":"+this.getState()+""+i);
			
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
