package recursion;

public class RecursionReverseString {

	 public static String reverse(String str){
         String tmp=null;
         if(str.length()>0) {
                     System.out.print(str.charAt(str.length() - 1));
                     tmp = reverse(str.substring(0, str.length() - 1));

             }
         return " Reversed";		//not necessary, if not required will need to add some ending condition.
     }
	 
	public static void main(String[] args) {

		String str="SUMEET";
		
		System.out.println(reverse(str));
		
	}
}
