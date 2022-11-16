package Scanner;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter first number here:-");
		int num1=scan.nextInt();
		
		System.out.println("Enter second number here:-");
		int num2= scan.nextInt();
		
		//Addition of numbers
		System.out.println("Addition = " + (num1 + num2));
		
		
	}

}
