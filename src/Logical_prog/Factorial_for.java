package Logical_prog;

public class Factorial_for {

	public static void main(String[] args) {
		
		int fact= 1;
		int num= 5;
		
		for(int i=1; i<=num; i++) {
			
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
