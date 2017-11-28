package interface_;

public class Location2d {
	private int x,y;
	public Location2d() {
		x=y=0;
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Location2d [x=" + x + ", y=" + y + "]";
	}
	
}
