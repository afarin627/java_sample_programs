package Logical_prog;

public class UpperLowerCount {

	public static void main(String[] args) {
		
		String s= "AFreen INamdar";
		int Ucount=0;
		int Lcount=0;
		
		for(int i=0; i<s.length(); i++) {
			
			char ch= s.charAt(i);
			if(ch<=80 && ch>=65) {
				Ucount++;
			}
			else if(ch<=122 && ch>=97) {
				Lcount++;
			}
			
		}
		System.out.println("Uppercase count is:-" +Ucount);
		System.out.println("Lowercase count is:-" +Lcount);
	}

}
