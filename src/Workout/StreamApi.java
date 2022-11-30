package Workout;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApi {
	public static void main(String[]args) {
		ArrayList<Integer>a=new ArrayList<>();
		a.add(150);
		a.add(300);
		a.add(300);
		a.add(251);
		a.add(555);
		
		for(Integer x:a) {
			System.out.println(x);    //for each enhance
		}
		
		
		a.forEach(x->System.out.println(x)); //for each lamda
		
		a.stream().filter(x->x%2==0).forEach(y->System.out.println(y)); //filter
		
		
		List<Integer>num=a.stream().filter(x->x%2!=0).collect(Collectors.toList()); //collect
		num.forEach(x->System.out.println(x));
		
		long c=a.stream().filter(x->x>200).count(); //count
		System.out.println(c);
		
		a.stream().distinct().forEach(x->System.out.println(x));  //distinct remove dupilcate
		
		
        Optional<Integer> hh = a.stream().findAny();    //find any 
        
        System.out.println(hh.get());
        
        if (hh.isPresent()) {
            System.out.println(hh.get());
        }
        else {
            System.out.println("no value");
        }
        
        
        Optional<Integer> kk = a.stream().findFirst();   //findfirst
        
        System.out.println(kk.get());
        
      
        
        

	}

}
