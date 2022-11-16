package Collection;

import java.util.ArrayList;

public class Arraylist { //don't confuse here we are talking about inbuilt class

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("Afreen");
		al.add('A');
		al.add(100);
		al.add(null);
		al.add(null);
		
		//print all data in class
		System.out.println(al);
		//get the size
		System.out.println(al.size());
		//to remove
		System.out.println(al.remove(1));
		
	}

}
