package Scanner;

import java.util.Scanner;

public class Replace_SpCh {

	public static void main(String[] args) {
		
		Scanner R= new Scanner(System.in);
		
		System.out.println("Enter String here.");
		
		String name= R.next();
		
		String correctName=name.replace("@", "U");
		
		System.out.println(correctName);
		
		R.close();
		
		
	}

}
