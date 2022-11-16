package Rev_String;

public class Palindrom {

	 static public void main(String[] args) {                    
		
		String org="N I T I N";
		String rev="";
		
		{
			for(int i=org.length()-1; i>=0; i--) {
				
				rev= rev + org.charAt(i);
			
			}
			System.out.println(rev);
		}
     if(org.equals(rev)) {
    	 System.out.println("palidrom string");
     }
     else {
    	 System.out.println("not palidrom");
     }
	}

}
