package Rev_String;

import java.util.Scanner;

public class SpecialCh {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter string with special character here.");
		
		String st=s.nextLine();
		
		String correctName=st.replaceAll("[^a-zA-Z]","");
		
		System.out.println();
		
		s.close();
		
		

	}

}
