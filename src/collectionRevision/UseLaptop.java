package collectionRevision;
import java.util.*;
import java.util.stream.Collectors;
public class UseLaptop {
	public static void main(String[] args) {
		Laptop lap1=new Laptop("dell",500000,true);
		Laptop lap2=new Laptop("hp",85858,false);
		Laptop lap3=new Laptop("acer",80000,true);
//		ArrayList<Laptop>lap=new ArrayList<>();
//		lap.add(lap1);
//		lap.add(lap2);
//		lap.add(lap3);
		HashMap<Integer,Laptop>lap=new HashMap<>();
		lap.put(1, lap1);
		lap.put(2, lap2);
		lap.put(3, lap3);
//		List<Laptop>c=lap.stream().filter(x->x.getIsTouchScreen()==true).collect(Collectors.toList());
//		c.forEach(x->System.out.println(x));                      //list to list
//		List<String>d=lap.stream().filter(x->x.getIsTouchScreen()==true).map(x->x.getBrand()).collect(Collectors.toList());
//		d.forEach(x->System.out.println(x));
		Map<Integer,Laptop>c=lap.values().stream().filter(x->x.getIsTouchScreen()==true).collect(Collectors.toMap(x->x.getPrice(),y->y));
		c.values().forEach(x->System.out.println(x));
		
		
	}

}
