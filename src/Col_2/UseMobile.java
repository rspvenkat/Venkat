package Col_2;
import java.util.*;

public class UseMobile {
	public static void main(String[]args) {
		Mobile mob1=new Mobile("samsung",100,25000);
		Mobile mob2=new Mobile("nokia",500,60000);
		Mobile mob3=new Mobile("iphone",501,52222);
		Mobile mob4=new Mobile("hawai",525,10000);
		Mobile mob5=new Mobile("iqoo",150,52525);
	
	ArrayList<Mobile> m =new ArrayList<>();
	m.add(mob1);
	m.add(mob2);
	m.add(mob3);
	m.add(mob4);
	m.add(mob5);
	HashMap<Integer,Mobile> mobile=new HashMap<>();
	mobile.put(1, mob1);
	mobile.put(2, mob2);
	mobile.put(3, mob3);
	mobile.put(4, mob4);
	mobile.put(5, mob5);
//	
	m.forEach(x->mobile.put(x.getId(), x));
	
//	for(int i=0;i<m.size();i++) {
//		mobile.put(m.get(i).getId(),m.get(i));
//	}
//	for(Mobile mob:m) {
//		mobile.put(mob.getId(),mob);
//	}
//	System.out.println(mobile);
//	Iterator<Mobile>mp1=mobile.values().iterator();
//	while(mp1.hasNext()) {
//		if(mp1.next().getPrice()<20000) {
//			mp1.remove();
//		}
//	}
	System.out.println(mobile);
	
	
	
	
	}

}
