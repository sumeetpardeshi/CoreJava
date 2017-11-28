package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//ARRAYLIST			: RandomAccess List that is auto growing, but not thread safe.
//INITIAL CAPACITY	: 10	(specified by DEFAULT_CAPACITY in ArrayList Class) 
//GROWS				: 1.5x (int newCapacity = oldCapacity + (oldCapacity >> 1))
//PROGRAM			: Demonstrate various basic operations on ArrayList.
//class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		List<Integer> list2= new ArrayList<Integer>();
		Integer array[]={10,20,30,40,50};
		
		//add elements to arraylist
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(1);
		list.addAll(Arrays.asList(array));	//adding array to ArrayList
											//list created using Arrays.asList is fixed size. 
		
		//by default capacity of ArrayList is 10, and it grows by 1.5x 
		//if no of elements<capacity, then ths method helps to trim datastructure capacity to its size.
		list.trimToSize();
		
		System.out.println("list"+list+":"+list.size());
		list2.add(3);
		list2.add(4);
		list2.add(9);
		System.out.println("list2"+list2+":"+list2.size());
		list.retainAll(list2);	//common elements between two collections //UNION operation
		System.out.println("list"+list+":"+list.size());
		
		list.clear();	//deletes all the values in arraylist.
		System.out.println("isEmpty:"+list.isEmpty());;	//check wether list is empty
			
	}
}
