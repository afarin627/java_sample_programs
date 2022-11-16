
public class Exception_handling {

	public static void main(String[] args) {
		
		int a= 70;
		int b= 0;
		
		
		try {
			int c= a/b;
		}
		
		catch(ArithmeticException E) {
			System.out.println(" Idiot Enter right denominator");
			System.out.println(" Exception is handled");
		}
		
		finally {
			System.out.println(" i'll execute irrispective of try and catch");
		}
	}

}
