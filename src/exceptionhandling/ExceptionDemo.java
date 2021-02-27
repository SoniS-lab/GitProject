package exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("statement 1");
			System.out.println(1/0);
			throw new Error();
//			System.out.println("test");
		} 
		
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
