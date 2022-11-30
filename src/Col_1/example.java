package Col_1;

import java.util.ArrayList;

public class example {
	public static void main(String[]args) {
		String pen1="reno";
		String pen2="cello";
		String pen3="rorito";
		String pen4="luxar";
		String pen5="hero";
		ArrayList<String>pens=new ArrayList<>();
		pens.add(pen1);
		pens.add(pen2);
		pens.add(pen3);
		pens.add(pen4);
		pens.add(pen5);
		
		//pens.add(1,pen2);
		//pens.remove(2);
		//pens.set(2, pen5);
		//pens.set(2, pen5="venkat");
		
		//for(int i=0;i<pens.size();i++) {
			//System.out.println(pens.get(i));
		//}
		
			//for(String a:pens) {
				//System.out.println(a);	
			//}
		
			pens.forEach(x->System.out.println(x));

		//System.out.println(pens);
		}
	}


//}
