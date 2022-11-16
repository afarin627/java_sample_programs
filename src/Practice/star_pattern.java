package Practice;

public class star_pattern {

	public static void main(String[] args) {
		int star = 1;
		int space = 4;
	  int num = 5;
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print("*");
	  }
			System.out.println();
			star+=2;
			space--;
		}
		
	}

}
