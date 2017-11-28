package threading;

public class CustomThreadUsingRunnableInterface implements Runnable{

	
	
	@Override
	public void run(){
		System.out.println("RunnableThread- started");
		
	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {			//Cant throw this out of Thread a run() in interface has no throws				
				e.printStackTrace();
		}
		
		System.out.println("RunnableThread- ended");
	}

}
