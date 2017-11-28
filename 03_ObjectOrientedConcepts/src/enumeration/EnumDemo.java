package enumeration;


enum myE{}; // can be declared here

public class EnumDemo {

	//Enums can only be declared at top level class, interface or static context 
	 enum DAYS{
		 MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);

		 int dayno;
		 DAYS(int day){		//constructor for enumeration
			 dayno=day;
		 }
		 int get() {		//we can also declare a function inside enum
			return this.dayno;
			}
	 }
	
	 enum MyEnum{}; //null enum
	 
	 
	 public static void main(String[] args) {
		
		
		 System.out.println(DAYS.MONDAY.get());;
		 
		 //System.out.println(MyEnum.valueOf("1"));  will cause exception as no element present
		 
		 //iterate on enums

		 for (DAYS  i : DAYS.values()) {		 
			 System.out.println(i+ " "+ i.get());
		}
		 
		 ;
		 
	}
}
