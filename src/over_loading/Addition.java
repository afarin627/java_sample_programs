package over_loading;

public class Addition {
	
	public static void main(String[] args) {
		Addition ad=new Addition();
		ad.add(40,20,30,10);
	}

	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}

	public void add(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
	}
}


