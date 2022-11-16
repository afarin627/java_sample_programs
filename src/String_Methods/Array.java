package String_Methods;

public class Array {

	public static void main(String[] args) {
		
		String ar[] = new String[4];
		
		ar[0] = "afreen";
		ar[1] = "Suraj";
		ar[2] = "ameer";
		
		for(int i=1; i<=ar.length-1; i++) {
		System.out.println(ar[i]);
		}
		try { 
			System.out.println(ar[5]);
		}
		
		catch(ArrayIndexOutOfBoundsException Ex){
			System.out.println("exception handled");
		}
		
		finally {
			System.out.println("thank you");
		}

	}

}
