package Logical_prog;

public class Vowels {

	public static void main(String[] args) {
		
 String s="afreenInmandar";
 int ccount=0; 
 int vcount = 0;
 
   s= s.toLowerCase();
 
 for(int i=0; i<=s.length()-1; i++) {
	char ch =s.charAt(i);
	
	if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u') {
		vcount++;
	}
	else{
		ccount++;
	}
 }
 
 System.out.println("vowels =" +vcount );
 System.out.println("constant =" +ccount);
 	
}
}