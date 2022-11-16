package Casting;

public class Nonpremitive {
	
	public static void main(String[] args) {
		
	
	
	Parent P=new Child(); //upcasting
	
	
     Child c = (Child) P;
	c.PocketMoney();
	c.property();
	
	


	}
}
