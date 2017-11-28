package list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

//COPYONWRITEARRAYLIST		: A TRUE thread safe variant of ArrayList, all mutative operations are done by creating a new COPY.
//INITIAL CAPACITY			: NO need of initial capacity as new ARRAY is created for new write.
//GROWS						: -
//PROGRAM					: Runs multiple readers and writer to read/write CopyOnWriteArrayList

//class CopyOnWriteArrayList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable


public class CopyOnWriteArrayListDemo extends Thread{
	
	CopyOnWriteArrayList<Integer> myCpyArrayList;
	private String MODE;
	
	public CopyOnWriteArrayListDemo(CopyOnWriteArrayList<Integer> v,char MODE) {
		myCpyArrayList= v;
		this.MODE=(MODE=='R')?"READ":"WRITE";
		this.start();
	}
	
	
	@Override
	public void run() {
	
		Iterator<Integer> it = this.myCpyArrayList.iterator();
		synchronized(this.myCpyArrayList) {
		if(this.MODE.equals("READ")) {
			//READER Reads from the vector
		
			while(it.hasNext())
				{
			System.out.println("READING:"+Thread.currentThread().getName()+":"+it.next());
				try {
						Thread.sleep(50);
					} 
				catch (InterruptedException e) {
						e.printStackTrace();
						}
				}
		}
		else
		{	//WRITER writes to vector
			System.out.print(":::WRITER WROTE:::");
			this.myCpyArrayList.add(999);		
		}}
	}


	public static void main(String[] args) {
	
		CopyOnWriteArrayList<Integer> v= new CopyOnWriteArrayList<Integer>();

		Integer arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
				
		v.addAll(Arrays.asList(arr)); 
		System.out.println(v.size());;
		CopyOnWriteArrayListDemo thread1reader= new CopyOnWriteArrayListDemo(v,'R');	
		CopyOnWriteArrayListDemo thread2reader= new CopyOnWriteArrayListDemo(v,'R');	
		CopyOnWriteArrayListDemo thread3reader= new CopyOnWriteArrayListDemo(v,'R');	
		CopyOnWriteArrayListDemo thread4reader= new CopyOnWriteArrayListDemo(v,'R');	
		CopyOnWriteArrayListDemo threadWriter= new CopyOnWriteArrayListDemo(v,'W');	
		CopyOnWriteArrayListDemo threadWriter1= new CopyOnWriteArrayListDemo(v,'W');
		
		String arg="sumeet";
		
		
				
	}
}
