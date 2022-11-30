package collectionRevision;
import java.util.*;
import java.util.stream.Collectors;

public class UseAc {
	public static void main(String[]args) {
		ArrayList<Ac>a=new ArrayList<>();
		a.add(new Ac("haier",true,50000,2));
		a.add(new Ac("crom",false,25000,1));
		a.add(new Ac("onida",true,85854,3));
		a.add(new Ac("voltas",false,15000,1));
		a.add(new Ac("bluestar",true,40000,3));
//		
//		List<String>d=a.stream().filter(x->x.getPrice()<30000).map(x->x.getBrand()).collect(Collectors.toList());
//		d.forEach(x->System.out.println(x));
//		
	//a.stream().filter(x->x.getIsInverter()==true).filter(x->x.getBrand().contains("o")).forEach(x->System.out.println(x));
	Map<Integer,Ac>s=a.stream().collect(Collectors.toMap(x->x.getPrice(),y->y));
	//s.values().forEach(x->System.out.println(x));
	s.values().stream().map(x->x.getBrand()).filter(x->x.length()>5).forEach(x->System.out.println(x));

	
		
		
		
	}
	

}
