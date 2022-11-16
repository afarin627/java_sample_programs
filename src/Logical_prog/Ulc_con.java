package Logical_prog;

public class Ulc_con {

	public static void main(String[] args) {
		
//		Private_Constructor c=new Private_Constructor("AKM",6);
		Private_Constructor c = Private_Constructor.getInstance();
		c.shoot();

		Private_Constructor d = Private_Constructor.getInstance();
		d.shoot();

	}

}
