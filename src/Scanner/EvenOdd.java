package Scanner;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner N= new Scanner(System.in);
		
		System.out.println("Enter number here");
		int num1=N.nextInt();
		
		if(num1 % 2==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}
	}

}
