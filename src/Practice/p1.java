package Practice;

public class p1 {
	public static void main(String[] args) {

  int num = 153;
   int actnum=num;
   int armnum=0;
   int r =0;
   
   
while (num > 0) {
	  
	  r = num % 10;
      armnum = r*r*r + armnum; 
	  
	  num = num/10;
	  
  }

if(armnum == actnum) {
	System.out.println("Number is Armstrong");
}
else {
	System.out.println("Number is not Armstrong");
}
		
}
}