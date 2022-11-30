package Lms;

import java.util.ArrayList;

public class UseBottle {
	public static void main(String[]args) {
		Bottle b1=new Bottle("milton",500,"green",true);
		Bottle b2=new Bottle("dove",100,"blue",true);
		Bottle b3=new Bottle("kinely",150,"orange",false);
		Bottle b4=new Bottle("pristege",400,"rose",true);
		ArrayList<Bottle>bt=new ArrayList<>();
		bt.add(b1);
		bt.add(b2);
		bt.add(b3);
		bt.add(b4);
		
		/*Bottle max=b1;
		for(int i=0;i<bt.size();i++) {
			if(max.getPrice()<bt.get(i).getPrice()) {
				max=bt.get(i);
			}
		
		}
		System.out.println(max);*/
		/*Bottle min=b1;
		for(Bottle i:bt) {
			if(min.getBrand().length()>i.getBrand().length()) {
				min=i;
			}		}
		System.out.println(min);
	}*/
		/*ArrayList<Bottle>metelBottle=new ArrayList<>();
		ArrayList<Bottle>plasticBottle=new ArrayList<>();
		
	bt.forEach(x->{
		if(x.getIsMetal()==true) {
			metelBottle.add(x);
		}
		else {
			plasticBottle.add(x);
		}
		
	});
	
	metelBottle.forEach(x->System.out.println(x));
	plasticBottle.forEach(x->System.out.println(x));
}*/
	for(int i=0;i<bt.size();i++) {
		if(bt.get(i).getColor().length()2%==0) {
			System.out.println();
		}
	}
		
	}
}