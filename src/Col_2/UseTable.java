package Col_2;

import java.util.*;

public class UseTable {
	public static void main(String[] args) {
		Table t1=new Table("Studytable",true,10000,"green");
		Table t2=new Table("Dinning table",false,500,"blue");
		Table t3=new Table("Short table",true,1000,"yellow");
		Table t4=new Table("kids table",false,5555,"orange");
		Table t5=new Table("computer table",true,25000,"black");
		HashMap<Integer,Table>tables=new HashMap<>();
		tables.put(1, t1);
		tables.put(2, t2);
		tables.put(3, t3);
		tables.put(4, t4);
		tables.put(5, t5);
		
//		Table max=t1;
//		for(Integer i:tables.keySet()) {
//			if(max.getPrice()<tables.get(i).getPrice()) {
//				max=tables.get(i);
//			}
//		}
//		System.out.println(max);	
		
		
		
//		Table max=t1;
//		for (Table x: tables.values()) {
//			if(max.getPrice()<x.getPrice()) {
//				max=x;
//			}
//		}
//		System.out.println(max);
//		
		int max=t1.getPrice();
		for(int i=0;i<tables.size();i++) {
			if(max<tables.get(i).getPrice()) {
				max=tables.get(i).getPrice();
			}
		}
		
		
//	tables.forEach((x,y)->System.out.println(x+" "+y));
//	}
//		Iterator<Table>itr=tables.values().iterator();
//		while(itr.hasNext()) {
//			if(itr.next().getType().contains("S")) {
//				itr.remove();
//			}
//		}
//		System.out.println(tables);
	}
}
		
	


