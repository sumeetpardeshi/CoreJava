package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListFullOperations {
	public static void main(String[] args) {
	
				///1 add operation arraylist
				ArrayList<String> stringList= new ArrayList<String> ();
				
				stringList.add("ALPHA");
				stringList.add("BRAVO");
				stringList.add("CHARLIE");
				stringList.add("DAVE");
				stringList.add("EMAN");
				System.out.println(stringList);
				
				
				///2  add operation arraylist
				ArrayList<String> colors= new ArrayList<String>();
				colors.add("RED");
				colors.add("GREEN");
				colors.add("BLUE");
				colors.add("BLACK");
				colors.add("WHITE");
				System.out.println(colors);
				
				///3  add using addAll, it accepts a Collection as input
				String additional_colors[]= {"VOILET","AQUA"};
				
				colors.addAll(Arrays.asList(additional_colors));	//convert array to List<>
				System.out.println(colors);
				
				
			
				String temp_team[]= {"ALPHA","BRAVO"};
					
				///4,5 remove specific or all elements, all elements provided in collections will be removed
				System.out.println(stringList.removeAll(Arrays.asList(temp_team)));// temp_team removed from stringList	
				System.out.println(stringList);
				
				
				String []remove= {"RED","GREEN","BLUE"};
				///6	it calculates the intersection operations on lists
				colors.retainAll(Arrays.asList(remove));

				System.out.println("colors after retaining remove aray"+colors);
				
				///7	return no of elements in the arrayList
				System.out.println(colors.size());
				System.out.println(stringList.size());
				
				///8
				colors.remove(colors);
				System.out.println(colors);
				
				///9 search single elements
				System.out.println(stringList.contains("DAVE"));;
				
				///10 seatrch collection
				System.out.println(colors);
				System.out.println(colors.containsAll(Arrays.asList(remove)));
				
				///11
				System.out.println("Printing via iterator:");
				Iterator it= stringList.iterator();
				
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
				
				///13
				colors.removeAll(colors);
				System.out.println("colors empty?"+colors.isEmpty());
				
				
				///14
				Object tmp[]=stringList.toArray();

				for (Object object : tmp) {
					System.out.println(object);			
				}
				
				///15
				ArrayList numList= new ArrayList<Integer>();
				
				for (int i=0;i<50;i++) {
					numList.add(i);
				}
				
				Iterator itr= numList.iterator();

				int n=0;
				while(itr.hasNext())
				{		
					if(n++%2==0)
					System.out.print(" "+itr.next());
					else
					itr.next();			
				}
				
				
				///16 ///17 
				
				///18
				stringList.add(0, "XMEN");
				System.out.println(stringList);
				
				///19	//get
				System.out.println(stringList.get(3));
				
				///20  //replace
				stringList.set(0, "IRONMAN");
				System.out.println(stringList);
				
				//21
				stringList.remove(0);
				System.out.println(stringList);
				
				
				
				///22 done earlier
				
				///23
				Collections.sort(numList);
				System.out.println(numList);
				
				///24
				
				ArrayList<Integer> ulta= numList;
				
				///25

				Collections.shuffle(numList);
				System.out.println(numList);

				///26
				Collections.reverse(ulta);
				System.out.println(ulta);
				
				///27
				System.out.println("sublist "+numList.subList(0, 10));
				
				///28
				System.out.println(numList.equals(numList));;
				ArrayList<Integer> tmp1= numList;
				System.out.println(numList.equals(tmp1));
					
				//29
				int last=numList.size()-1;
				
				int tmpno=(int)numList.get(0);
				numList.set(0, numList.get(last));
				numList.set(last, tmpno);
				
				System.out.println(numList);
				
				ArrayList<Integer> clonenumlist=(ArrayList<Integer>) numList.clone();
				
				System.out.println(clonenumlist);
				

	}
}
