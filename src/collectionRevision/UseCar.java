package collectionRevision;
import java.util.*;

import for1.Add;

public class UseCar {
	public static void main(String[]args) {
		Car c1=new Car("bmw",50000,true);
		Car c2=new Car("benz",40000,false);
		Car c3=new Car("audi",25000,true);
		ArrayList<Car>c=new ArrayList<>();
		c.add(c1);
		c.add(c2);
		c.add(c3);
		
//		Car  max=c1;
//		for(int i=0;i<c.size();i++) {
//			if(max.getPrice()<c.get(i).getPrice()) {            //max normal forLoop
//				max=c.get(i);
//			}
//		}
//		System.out.println(max);
		
//		Car max=c1;
//		for(Car x:c) {                                   
//			if(max.getPrice()<x.getPrice()) {                   //max enhance forLoop
//				max=x;
//			}
//		}
//		System.out.println(max);
		
//		c.forEach(x->{
//			if(x.getBrand().contains("a")||x.getBrand().contains("e")) {
//				System.out.println(x.getBrand()+" contains vowels");
//			}                                                             //vowels forEachLamda
//			else {                                                       
//				System.out.println(x.getBrand()+" not contain vowels");
//			}
//		}); 
		
//		for(int i=0;i<c.size();i++) { 
//			if(c.get(i).getBrand().contains("a")||c.get(i).getBrand().contains("e")) {
//				System.out.println(c.get(i)+"vowels");                                  //normal for vowels
//			}
//			else {
//				System.out.println(c.get(i)+" not vowels");
//			}
//		}
		
//		for(Car x:c) {
//			if(x.getBrand().contains("a")||x.getBrand().contains("e")||x.getBrand().contains("i")) {
//				System.out.println(x+" is has vowels");                                //enhance forLoop vowels
//			}
//			else {
//				System.out.println(x+" is has not vowels");
//			}
//		}
		
	//	ArrayList<Car>petrol=new ArrayList<>();
		
//		for(int i=0;i<c.size();i++) {
//			if(c.get(i).getIsPetrol()==true) {
//				petrol.add(c.get(i));				         //store arrayList
//			}
//		}
//		petrol.forEach(x->System.out.println(x));
		
//		c.forEach(x->{
//			if(x.getIsPetrol()==false) {
//				petrol.add(x);                              //store arrayList foreachLamda
//			}
//		});
//		petrol.forEach(x->System.out.println(x));
		
//		for(Car a:c) {
//			if(a.getIsPetrol()==true) {
//				petrol.add(a);                             //store arrayList enhanceLoop
//			}
//		}
//		for(Car v:petrol) {
//			System.out.println(v);
//		}
	}
	

}
