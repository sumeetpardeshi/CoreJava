package threading;

public class UtilityShow {
	//			  static void show() {  //thread not guranteed to complete whole function in one go
	 synchronized static void show() {	//thread completes whole function in one go then grants control to other
		System.out.print("["+Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("]");
	
	}
	
}
