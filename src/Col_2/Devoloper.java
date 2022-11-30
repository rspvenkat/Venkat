package Col_2;
import java.util.*;

public class Devoloper {
	public static void main(String[] args) {
		String name1="venkat";
		String name2="deva";
		String name3="arujun";
		String name4="nirmal";
		String name5="bavadarani";
		HashMap<Integer,String>developers=new HashMap<>();
		developers.put(1, name1);
		developers.put(2, name2);
		developers.put(5, name3);
		developers.put(3, name4);
		developers.put(10, name5);
		developers.put(1, name5);
		
		//developers.remove(5);
		//developers.put(5, name1);
		//System.out.println(developers.get(5));
		//System.out.println(developers.keySet());
		//System.out.println(developers);
		//System.out.println(developers.values());
//		for(Integer x:developers.keySet()) {
//			System.out.println(x+" "+developers.get(x));
//}
//		for(String x:developers.values()) {
//			System.out.println(x);
//		}
	//	developers.keySet().forEach(x->System.out.println(developers.get(x)));
		
		developers.values().forEach(x->System.out.println(x));
		
		for(String x:developers.values()) {
			System.out.println(x);
		}
		
		//developers.keySet().forEach(i->System.out.println(i+" "+developers.get(i)));
		//developers.forEach((x,y)->System.out.println(y));
		
		
	}

}
