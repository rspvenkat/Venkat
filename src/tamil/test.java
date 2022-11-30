package tamil;

import java.util.ArrayList;

public class test {
	public static void main(String[]args) {
		ArrayList<Integer> a= new ArrayList<>();
		a.add(5);
		a.add(10);
		ArrayList<Integer> b = new ArrayList<>();
		a.forEach(x->b.add(x));
		//System.out.println(a);
		a.clear();

		System.out.println(b);
		System.out.println(a);
	
	}

}
