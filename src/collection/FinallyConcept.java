package collection;

public class FinallyConcept {

	public static void main(String[] args) {

		//test1();
		division();
	
		
		
	}
	         //final is a key word
			//finally is a block
			//finalize is a method
	
	public static void test1()
	{
		try {
			System.out.println("this is belongs to test1");
			throw new RuntimeException("test");
		}catch(Exception e) {
			System.out.println("inside catch block");
		}
		finally {
			
			System.out.println("inside finally block ");
		}
		
	}
	
	
	public static void division()
	{
		int i=10;
		try {
			System.out.println("inside try block");
			int k=i/0;
		}catch(NullPointerException e) {
			System.out.println("inside catch block ");
			System.out.println("divide by zero error");
		}
		
		
		
		finally
		
		{
			
			System.out.println("execute finally method even there are any exception");
		}
		//finally method execute any test even they have exceptions
		// if we want to see exception we should write (NullPointerException e) instead of ArithmeticException
	}
		
		
		
		
		
	
		
			
		
		
		
		
		
		
		
		
		
		

}
