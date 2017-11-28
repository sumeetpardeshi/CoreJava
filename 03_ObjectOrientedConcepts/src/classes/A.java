package classes;

//class cannot be private 
//it can be public abstract or final
public class A {
	public int number1,number2;
	public A() {
		number1=911;
		number2=100;
	}
	
	public void show() {
		new InnerClass().show(this.number1, this.number2);
	}
	
	
	//incase of inner class it can be private
	private class InnerClass{
		public void show(int number1,int number2) {
			System.out.println("number1:"+number1+"\nnumber2:"+number2);
		}
	}
}



