package StarPatterns;

public class STAR_pattern {

	public static void main(String[] args) {
		
		int star=1;
		int space=4;
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print("*");
			}
			System.out.println();
			{
				if(star<=5) {
					star+=4;
					space--;
				}
				else if(star==9) {
					star-=2;
					space++;
				}
				else if(star<=7){
					star=star+2;
					space--;
				}
				else {
					star-=4;
					space+=2;
				}
			}
		}

	}

}
