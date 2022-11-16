package String_Methods;

public class Methods_of_String {

	public static void main(String[] args) {
		
		String s1 = "velocity";
		String s2 = "VELOCITY";
		String s3 = "velo";
		
		System.out.println(s1.length());// length
		System.out.println(s1.toUpperCase()); //convert to upper case.
		System.out.println(s2.toLowerCase()); //convert to lower case.
		System.out.println(s2.equals(s1));    // Compare
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains(s3));  // string contains another string
	    System.out.println(s3.charAt(0));    //give particular position of char
	    System.out.println(s2.indexOf('C')); // give index of char 
	    System.out.println(s2.startsWith("VE")); //String starts with particular character
	    System.out.println(s2.endsWith("TY")); //String ends with particular character
	    System.out.println(s1.substring(6));
	    
	    System.out.println(s1.indexOf('z'));
	
	
	
	}

}
