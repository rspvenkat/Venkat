package collectionRevision;
import java.util.*;
import java.util.stream.Collectors;

public class UseTable {
	public static void main(String[] args) {
		Table t1= new Table("cello",1500,true,6);
		Table t2=new Table("woodpeker",4500,false,8);
		Table t3=new Table("sony",8587,true,7);
		Table t4=new Table("nikamal",4574,false,9);
		Table t6=new Table("nikamal",4574,false,9);
		Table t5=new Table("woodpeker",4500,false,8);
		ArrayList<Table>tab=new ArrayList<>();
		tab.add(t1);
		tab.add(t2);
		tab.add(t3);
		tab.add(t4);tab.add(t4);tab.add(t4);tab.add(t5);
//		List<Table>t=new ArrayList<>();
//		tab.forEach(x->{
//			if(x.getPrice()>4000) {
//				t.add(x);
//			}
//		});
//		t.forEach(x->System.out.println(x));
		Set<Table>s=tab.stream().collect(Collectors.toSet());
		s.forEach(x->System.out.println(x));
	}

}
