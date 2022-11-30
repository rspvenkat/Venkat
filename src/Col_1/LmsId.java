package Col_1;

import java.util.ArrayList;


public class LmsId {
	public static void main(String[]args) {
		int id1=542;
		int id2=644;
		int id3=545;
		int id4=585;
		int id5=875;
		ArrayList<Integer>id=new ArrayList<>();
		id.add(id1);
		id.add(id2);
		id.add(id3);
		id.add(id4);
		id.add(id5);
		
		//for(int i=0;i<id.size();i++) {             //normal for loop
			//System.out.println(id.get(i));
		//}
		
		Integer max=id1;
		for(Integer i:id) {                          //enhance for loop
			if(max<i) {
				max=i;
			}}
			System.out.println(max);
		
		//id.forEach(x->System.out.println(x));     //forEach Lambda
		
		/*id.forEach(x->{
		if(x%2==0) {
			System.out.println("is evennumber"+x);
		}
		else {
			System.out.println("is oddnumber"+x);
		}
		});*/
		
	
	}

}
