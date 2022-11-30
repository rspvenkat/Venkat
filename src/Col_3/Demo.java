package Col_3;
import java.util.*;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[]args) {
		ArrayList<Integer>a=new ArrayList<>();
		a.add(100);
		a.add(353);
		a.add(300);
		a.add(251);
		a.add(555);
		a.forEach(x->System.out.println(x-100));
//		a.stream().filter(x->x%2==0).forEach(y->System.out.println(y));       
//		List<Integer>num=a.stream().filter(x->x%2!=0).collect(Collectors.toList());
//		num.forEach(x->System.out.println(x));
		
//		long c=a.stream().filter(x->x>200).count();
//		System.out.println(c);
	}

}
