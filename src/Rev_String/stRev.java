package Rev_String;

import java.util.Scanner;

public class stRev {

	public static void main(String[] args) {
		
		String rev =" ";
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter string here:-");
		
		String name = s.nextLine();
		
		for(int i=name.length()-1; i>=0; i--) {
			
			rev = rev + name.charAt(i);
		}
		System.out.println(rev); 
		
		s.close();
		
		

}
}