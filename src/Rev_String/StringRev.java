package Rev_String;

public class StringRev {

	public static void main(String[] args) {
	
	String org="A F R E E N";
	String rev="";
	
	for(int i=org.length()-1; i>=0; i--) {
		
		rev=rev+ org.charAt(i);
		
	}
	System.out.println(rev);
	
	
}
}

