package interface_;

public class Player implements PlayerCharacteristics{

	
	@Override
	public void goForward(Location2d current) {
		current.setY(current.getY()-1);
	}

	@Override
	public void goLeft(Location2d current) {
		current.setX(current.getX()-1);
	}

	@Override
	public void goRight(Location2d current) {
		current.setX(current.getX()+1);
	}

	@Override
	public void goBack(Location2d current) {
		current.setY(current.getY()+1);
		
	}


}
