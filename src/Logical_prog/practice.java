package Logical_prog;

public class practice {
	public static void main(String[] args) {
		
	String s= "afreen suraj Inamdar";
	int count=1;
	
	for(int i = 0; i<=s.length()-1; i++) {
		
		if(s.charAt(i) == ' ' && s.charAt(i)+1!= ' ') {
			count++;
		}
	}
		System.out.println("Number of words =  " +count);
		
		
		
	   }
	}