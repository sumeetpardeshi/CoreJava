package inheritance;

import classes.AbstractFigure;

//if abstract class extended then need to ovverride its function compulsorily
public class AbstractClassDemo extends AbstractFigure{
	
	public static void main(String[] args) {
		
		
		new AbstractClassDemo().calculateVolume();
		
		
		//if try to create object
		//we cannot use new, we need to create a anonymous inner class
		
		AbstractFigure fig=new  AbstractFigure() {
			@Override
			public void calculateVolume() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
	}

	@Override
	public void calculateVolume() {
		System.out.println("Overriden method volume");
		
	}
}
