package nested_classes;
//localclass- inner class declared within a scope of loop, method .
//local class can only be abstract or final
public class LocalClassesDemo {
	
	public void print(int n) {
		
		
			 class Table{
				String display() {
					return "*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*";
				}				
			}
			 
			 for(int i=0;i<n;i++)
				{
			System.out.println(new Table().display());;
		}
	}
	
	public static void main(String[] args) {
		
		new LocalClassesDemo().print(10); 
		
	}
}
