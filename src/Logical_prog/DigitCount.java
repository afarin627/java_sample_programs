package Logical_prog;

public class DigitCount {

public static void main(String[] args) {
	
   String s = "ab333fh893njk";
   int digits=0;
   
   for(int i=0; i<s.length(); i++) {
	   
	 // if(s.charAt(i)>= 48 && s.charAt(i)<= 57) 
	   
	   if (Character.isDigit(s.charAt(i)))
           digits++;
   }
   System.out.println("Total number of Digits = "
                      + digits);
   }

}

