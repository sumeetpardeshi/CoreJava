package exception_handling;

import java.io.IOException;

public class ExceptionDemo {	
	public static void main(String[] args) 
	{
		
		//occurs COMPILE TIME
		//checked exception - inherits Exception but not RuntimeException
		//IO, SQL, Class not found 
		
		try {
			//if some line throws checked exception
			throw new IOException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Catched");
			e.printStackTrace();
		
		}
		finally {
			System.out.println("finally");
		}
		
		
		
		
		try {
				
		System.out.println("only try");
		}finally {
		System.out.println("only finally");
		}
		
		//occurs RUN TIME
		//unchecked exception - inherits RuntimeException
		//arithmetic, nullpointer
		//int n= 10/0;
		
		// checked exception need to catch compulsorily
		try {
			throw new IOException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//can be thrown but wont show compile time error as its unchecked exception
		//throw new RuntimeException();
		
		//throw new StackOverflowError();
		
		try {
			System.out.println("throw custom exception");
			throw new CustomExceptionUsingThrowable();
		} catch (CustomExceptionUsingThrowable ea) {
			// TODO Auto-generated catch block
			System.out.println("Catch block- exception");
			ea.printStackTrace();
			//System.out.println(ea.getCause());
			Thread
		}
		
	}
}
