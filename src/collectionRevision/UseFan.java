package collectionRevision;
import java.util.*;

public class UseFan {
	public static void main(String[]args) {
		Fan f1=new Fan("orient",54544,true);
		Fan f2=new Fan("cello",8585,false);
		Fan f3=new Fan("almorold",845,true);
		HashMap<Integer,Fan>f=new HashMap<>();
		f.put(1, f1);
		f.put(2, f2);                                              //HashMap
		f.put(3, f3);
		
		
		for(Integer i:f.keySet()) {
			f.remove(i);
		}
		
//		ArrayList<Fan>f=new ArrayList<>();
//		f.add(f1);
//		f.add(f2);                                               //arrayList
//		f.add(f3);
		
		
//		
//		Iterator<Fan>itr=f.values().iterator();
//		while(itr.hasNext()) {
//			if(itr.next().getPrice()<5000) {
//				itr.remove();
//			}                                                        //Iterator using hashMap values
//	   }
//		f.values().forEach(x->System.out.println(x));
//	}
////	Iterator<Integer>itr=f.keySet().iterator();
//	while(itr.hasNext()) {                                        //Iterator using hashMap keySet
//		if(f.get(itr.next()).getPrice()>5000) {
//			itr.remove();
//		}
//	}
//	f.values().forEach(x->System.out.println(x));
//	Iterator<Integer>itr=f.keySet().iterator();
//	while(itr.hasNext()) {
//		if(f.get(itr.next()).getBrand().contains("a")) {           //Iterator using hashMap keySet
//		itr.remove();
//	}
//	}
//	f.values().forEach(x->System.out.println(x));
//
//		Iterator<Fan>itr=f.iterator();
//		while(itr.hasNext()) {
//			if(itr.next().getBrand().contains("a")) {
//				itr.remove();                                        Iterator using ArrayList 
//			}
//		}
//		f.forEach(x->System.out.println(x));

}
}