package ExceptionHnadling;

public class Exepthandling {
	
public static void main(String[] args) {
	
	int a= 60;
	int b=0;
	
	try {
		int c= a/b;
		}
	
	catch(ArithmeticException E) {
		
		System.out.println("idiot enter valid denominator.");
		System.out.println("Exception Handled");
	}
	
	finally {
		System.out.println("\n I'll execute irrispective of try and catch block.");
	}
	
}
}
