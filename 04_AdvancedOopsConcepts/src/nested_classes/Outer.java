package nested_classes;

public class Outer {

	  private int x=10;

	  public void f() {
	    Inner inner = new Inner();
	    inner.g();					//inner variable can be accessed in outer class irrespective of giving it private
	    inner.y = 5;
	    System.out.println(inner.y);
	  }

	  private class Inner {
	    private int y;				//this is private variable but Outer can access this variable

	    public void g() { 
	    System.out.println(x+": x before");
	    x = 5; 
	    System.out.println(x+": x after");
	    }
	  }
	  
	  
	  
	  public static void main(String[] args) {
		
		  Outer o= new Outer();
		  o.f();
	  }
	}