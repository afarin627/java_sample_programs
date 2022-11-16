package Logical_prog;

public class count_space {
 public static void main(String[] args) {
	 
	String s="Afreen Suraj Inamdar";
	int up=0;
	int down=0;
	String space = " ";
	
	for(int i=0; i<=s.length()-1; i++) {
		
		if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)==' ') {
			up++;
		}
		else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
			down++;
		}
	}
	System.out.println(up);
	System.out.println(down);
 }
}
