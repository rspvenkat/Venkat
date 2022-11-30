package Col_2;
import java.util.*;

public class UseDress {
	public static void main(String[]args) {
		Dress d1=new Dress("Cotton",1000,true,"Green",42);
		Dress d2=new Dress("line",500,false,"blue",50);
		Dress d3=new Dress("poly",1400,true,"orange",55);
		Dress d4=new Dress("waterproof",1500,false,"white",42);
		Dress d5=new Dress("checked",5000,true,"black",42);

		
		HashMap<String,Dress>dresss=new HashMap<>();
		dresss.put(d1.getMaterial(), d1);
		dresss.put(d2.getMaterial(), d2);
		dresss.put(d3.getMaterial(), d3);
		dresss.put(d4.getMaterial(), d4);
		dresss.put(d5.getMaterial(), d5);
		/*Dress max=d1;
		for(String y:dresss.keySet()) {
			if(max.getSize()<dresss.get(y).getSize()) {
				max=dresss.get(y);
			}
			
		}                              
		System.out.println(max);*/
		
		/*HashMap<String,Dress>branded=new HashMap<>();
		HashMap<String,Dress>local=new HashMap<>();
		dresss.forEach((x,y)->{
			if(y.getIsBranded()==true) {
				branded.put(x,y);
			}
			else {
				local.put(x, y);
			}
		});
		//branded.forEach((x,y)->System.out.println(y));
		local.forEach((x,y)->System.out.println(y));*/
		
		Iterator<Dress>itr=dresss.values().iterator();
		while(itr.hasNext()) {
			Dress temp=itr.next();
			//System.out.println(itr.next());
			if(temp.getColor().contains("a")) {
				itr.remove();
			}
		dresss.forEach((x,y)->System.out.println(y));
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}                     