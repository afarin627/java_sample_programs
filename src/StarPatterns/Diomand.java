package StarPatterns;

public class Diomand {

	public static void main(String[] args) {
		
		int space=4;
		int star=1;
		int row=9;
		
		for(int i=1; i<=row; i++) {
			
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=star; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			if(i<=4) {
			star+=2;
			space--;}
			else {
				star-=2;
				space++;
			
		}
		}		
		
			
	}

}
 