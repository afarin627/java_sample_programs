package StarPatterns;

public class star_pyramid {

	public static void main(String[] args) {
		
		int star=1;
		int space=3;
		int rows=5;
		
		int customStar=0;
		int customSpace=0;
		
		for(int i=1; i<=rows; i++) {

			if( i == 2) {
				customStar = star+2;
				customSpace = space-1;
//			}else if( i == 4) {
//				customStar = star-2;
//				customSpace = space+1;
			}else if( i == 5) {
				customStar = star-3;
				customSpace = space+2;
			}else {
				customStar = star;
				customSpace = space;
			}

			for(int j=1; j<=customSpace; j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=customStar; j++) {
				System.out.print("*");
			}

			if( i<=2 ) {
				star+=2;
				space--;
			}else {
				star-=2;
				space++;
			}

			System.out.println();
		}

	}

}
