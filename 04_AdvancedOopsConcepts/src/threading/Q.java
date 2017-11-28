package threading;

public class Q {

	static boolean valuePresent=false;
	static int buffer;
	
	synchronized public int get() throws InterruptedException {
		while(!valuePresent) {
			wait();
			System.out.println("get waiting");
		}
		System.out.println("GET:"+buffer);
		valuePresent=false;
		notify();
		return buffer;
	}
	
	synchronized public void put(int x) throws InterruptedException {
		while(valuePresent) {
			wait();
			System.out.println("put waiting");
		}
		System.out.println("PUT:"+x);
		buffer=x;
		valuePresent=true;
		notify();
		
	}
}
