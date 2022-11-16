package Logical_prog;

public class Private_Constructor {

		
	String name;
	int noOfBullets;
	
	static int refCount = 0;
	static Private_Constructor object;

//	private Private_Constructor(String name, int noOfBullets){
//		this.name=name;
//		this.noOfBullets=noOfBullets;
//	}

	private Private_Constructor(){
		this.name="AK47";
		this.noOfBullets=4;
	}
	
	static Private_Constructor getInstance(){
		
		if( 0 == refCount ) {
			
			object = new Private_Constructor();
		}
		
		refCount++;
		
		return object;
	}

	public void shoot() {
		for(int i=1; i<=noOfBullets; i++) {
			System.out.println("dheshew");
		}
	}
		
		
}


