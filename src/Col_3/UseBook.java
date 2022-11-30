package Col_3;
import java.util.*;
import java.util.stream.Collectors;

public class UseBook {
	public static void main(String[]args) {
		Book bk1=new Book("john",550,420,"Traveler");
		Book bk2=new Book("Arun",758,150,"Java");
		Book bk3=new Book("nirmal",250,757,"c++");
		Book bk4=new Book("venkat",858,454,"Python");
		ArrayList<Book>bk=new ArrayList<>();
		bk.add(bk1);
		bk.add(bk2);
		bk.add(bk3);
		bk.add(bk4);
		Map<Integer,Book>bks=bk.stream().filter(x->x.getPrice()>400).collect(Collectors.toMap(x->x.getNoOfPage(),y->y));
		bks.values().forEach(x->System.out.println(x));
		
//		List<String>bks=bk.stream().filter(x->x.getName().equalsIgnoreCase("java")).map(x->x.getAuthor()).collect(Collectors.toList());
//		bks.forEach(x->System.out.println(x));
		
		
	}

}
