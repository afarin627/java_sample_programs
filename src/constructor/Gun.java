package constructor;

public class Gun {
	String name;
	int noOfBullets;
	
	public Gun(String name, int noOfBullets) {
		
		this.name=name;
		this.noOfBullets=noOfBullets;
	}

	public void shoot() {
		for(int i=1; i<=noOfBullets;i++){
		System.out.println("dhishkew");
	}
}
}