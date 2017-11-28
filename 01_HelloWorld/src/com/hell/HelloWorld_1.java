package com.hell;

public class HelloWorld_1 {
	public static void main(String[] args) {
	System.out.println("1st main");
	System.out.println("Processors:"+Runtime.getRuntime().availableProcessors());
	System.out.println("Max Memory:"+Runtime.getRuntime().maxMemory()+"bytes");
	System.out.println("Free Memory:"+Runtime.getRuntime().freeMemory()+"bytes");

	if(args.length>0)
	{
		System.out.println("arguments= "+args[0]+" "+args[1]);
	}	
}
	
	public static void main(String[] args,int a) {
		System.out.println("totally allowed, called as normal static method");
	};
	
}
