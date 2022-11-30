package collectionRevision;
import java.util.*;
import java.util.stream.Collectors;

public class UseMarker {
	public static void main(String[] args) {
		Marker mar1=new Marker("lurxt",15,true,"green");
		Marker mar2=new Marker("rorito",52,false,"blue");
		Marker mar3=new Marker("cello",150,true,"yellow");
		Marker mar4=new Marker("butterfly",250,true,"red");
		Marker mar5=new Marker("hero",25,false,"pink");
		HashMap<Integer,Marker>mar=new HashMap<>();
		mar.put(1, mar1);
		mar.put(2, mar2);
		mar.put(3, mar3);
		mar.put(4, mar4);
		mar.put(5, mar5);
//		
//		Iterator<Marker>itr=mar.values().iterator();
//		while(itr.hasNext()) {                                    //Itertor showing is removed
//			Marker temp=itr.next();
//			if(temp.getBrand().contains("e")) {
//				//System.out.println(temp+" is removed");
//				itr.remove();
//			}
//		}
//		mar.values().forEach(x->System.out.println(x));
		
//		List<Marker>m=mar.values().stream().collect(Collectors.toList());
//		m.forEach(x->System.out.println(x));
		ArrayList<Marker>arr=new ArrayList<>();
		
		for(Marker x:mar.values()) {
			arr.add(x);
		}
		arr.forEach(x->System.out.println(x));
		
		
	}

}
