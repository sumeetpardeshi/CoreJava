package classes;

public class B extends A{
	public int number1,number2;
	private String string1,string2;
	public B() {
		this.string1="Hell";
		this.string2="Heaven";
		this.number1=9999;
		this.number2=9999;
		
	}
	public void show() {
		//super.show();
		System.out.println("string1:"+string1+"\nstring2:"+string2+"\nnumber1:"+number1+"\nnumber2:"+number2);
	}
}
