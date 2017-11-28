package classes;

public class Box {
	
	private double height,width,breadth;
	
	public Box()
	{
		height=width=breadth=100;
		
	}
	
	public Box(double height,double width,double breadth){
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	
	public double volume() {
		return this.height*this.width*this.breadth;
		
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Box [height=" + height + ", width=" + width + ", breadth=" + breadth + "]";
	}
	
	
	
}
