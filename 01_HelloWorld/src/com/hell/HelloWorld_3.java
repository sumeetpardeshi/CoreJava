package com.hell;

public class HelloWorld_3 {

//	returntype doesnt play any role in identification of overloaded functions
//	Its just the function name and parameters that matters. functionname(params)

	
	public static int main(String[] args) {
	
		return 0;
}
	
	public static boolean main(String[] args) {
		return true;
	}
	
	
	//totally allowed, no overload, totally different function
	public static int Main(String args[])
	{
		return 0;
	}
}
