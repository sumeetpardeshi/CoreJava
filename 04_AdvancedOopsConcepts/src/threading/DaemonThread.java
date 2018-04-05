package threading;

public class DaemonThread implements Runnable{

	@Override
	public void run() {
		try {
			while(true) {System.out.println("Processing daemon");
		
			Thread.sleep(500);}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
