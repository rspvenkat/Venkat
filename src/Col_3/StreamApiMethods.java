package Col_3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiMethods {
	public static void main(String[] args) {
		ArrayList<Integer> kk = new ArrayList<>();
		kk.add(100);
		kk.add(125);
		kk.add(150);
		kk.add(100);
		kk.add(50);
		
//		List<Integer> jj =kk.stream().map(x->x+100).collect(Collectors.toList());   //map() is use to do some task 
//		jj.forEach(x->System.out.println(x));                                      //collect() is use to collect the values to store list or map]/
//		
//		Long ss=kk.stream().filter(x->x<100).count();           //count() the flow of the values
//	    System.out.println(ss);									//filter() is use to filter the stream
//	    
//	    List<Integer> yt = kk.stream().distinct().collect(Collectors.toList());    //distinct() is use to remove duplicate
//	    yt.forEach(x->System.out.println(x)); 
//	    
	    boolean uu=kk.stream().anyMatch(x->(x<=10));                  //any match () is use to match any object
	    System.out.println(uu);
	    
	    List<Integer> ij=kk.stream().sorted().toList();
	    ij.forEach(x->System.out.println(x));
	}



}
