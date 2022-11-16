package Casting;

public class explicit_casting {
	
	public static void main(String[] args) {
		
		int i1=(int)5.5; //float->int data loss
		int i2=(int)4798777l;
		
		int d1= (int)4.5+ 3; //data loss
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(d1);
	}

}
