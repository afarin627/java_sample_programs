package StarPatterns;

public class STAR1 {

	public static void main(String[] args) {
		
		int star=1;
		int space=2;
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=space; j++) {
			System.out.print("  ");
		}
		for(int j=1; j<=star; j++) {
			System.out.print("* ");
		}
		System.out.println();
        if(i==1) {
			star+=4;
			space-=2;
		}
		else if(i==4) {
			star-=4;
			space+=3;
		}
		else if(i==3) {
			star+=2;
			space-=2;
		}
		else if(i==2){
			star-=2;
			space+=1;
		}
		else {
	}
	}
}}
