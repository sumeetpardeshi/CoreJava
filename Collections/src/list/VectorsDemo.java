package list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
//VECTORS			: A thread safe variant of ArrayList, all methods are SYNCHRONIZED
//INITIAL CAPACITY	: 10 (specified by passing Vector(10) harcoded)
//GROWS				: 1.5x (int newCapacity = oldCapacity + (oldCapacity >> 1))
//PROGRAM			: Runs multiple readers and writer to read/write common Vector, (sometimes may cause ConcurrentModificationException)

//class Vector<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable
public class VectorsDemo extends Thread{
	
	private Vector<Integer> myVector;
	private String MODE;
	VectorsDemo(Vector<Integer> v,char MODE)
	{
		myVector= v;
		this.MODE=(MODE=='R')?"READ":"WRITE";
		this.start();
	}
	
	@Override
	 public void run() {
		Iterator<Integer> it = this.myVector.iterator();
		synchronized(this.myVector) {
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
			this.myVector.add(this.myVector.lastElement()+1);
		}}
		
	}
	
	public static void main(String[] args) {
		Integer arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		Vector v= new Vector(3,2);

		v.addAll(Arrays.asList(arr)); 
		System.out.println(v.capacity());;
		VectorsDemo thread1reader= new VectorsDemo(v,'R');	
		VectorsDemo thread2reader= new VectorsDemo(v,'R');	
		VectorsDemo thread3reader= new VectorsDemo(v,'R');	
		VectorsDemo thread4reader= new VectorsDemo(v,'R');	
		VectorsDemo threadWriter= new VectorsDemo(v,'W');	
		VectorsDemo threadWriter1= new VectorsDemo(v,'W');	
		
		
	}
}
