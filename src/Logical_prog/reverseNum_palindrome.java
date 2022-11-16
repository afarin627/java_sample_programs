package Logical_prog;

import java.util.Scanner;

public class reverseNum_palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		
		int rev=0;
		int c;
		while(num>0) {
			c= num%10;
			num=num/10;
			System.out.print(c);
		}
		if(num == rev) {
		 System.out.println("Number is Palindrome");
		 }
		else {
			System.out.println("Number is Not Palindrome");
		} 
	}

}
