package collectionRevision;
import java.util.*;
public class UseBike {
	public static void main(String[]args) {
		Bike b1=new Bike("yamaha",50000,true);
		Bike b2=new Bike("j",85858,true);
		Bike b3=new Bike("honda",55555,false);
		
		HashMap<Integer,Bike>b=new HashMap<>();
		b.put(1, b1);
		b.put(2, b2);
		b.put(3, b3);
		
//		int max=b1.getPrice();
//		for(Integer x:b.keySet()) {                       //max price enhance forLoop
//			if(max<b.get(x).getPrice()) {
//				max=b.get(x).getPrice();		
//			}
//			
//		}
//		System.out.println(max);
//		Bike max=b1;
//		for(Integer x:b.keySet()) {
//			if(max.getPrice()<b.get(x).getPrice()) {      // max price enhance FORLOOP
//				max=b.get(x);
//			}
//		}
//		System.out.println(max);
		
//		for(Integer x :b.keySet()) {
//			if(b.get(x).getIsPetrol()==true) {            //enhance forLoop  checking
//				System.out.println(b.get(x)+" ispetrol");
//			}
//		b.keySet().forEach(x->{
//			if(b.get(x).getIsPetrol()==true) {                 // forEachLamda checking
//				System.out.println(b.get(x)+ "isPetrol");    
//			}			
//		});
			
//		for(Integer x:b.keySet()) {
//			if(b.get(x).getBrand().contains("a")||b.get(x).getBrand().contains("e")||b.get(x).getBrand().contains("i")) {
//				System.out.println(b.get(x)+ "contains vowels");           
//			}                                                     //enhance forLoop vowels
//			else {
//				System.out.println(b.get(x)+" is not Contains vowels");
//			}
//		}
//		b.keySet().forEach(x->{
//			if(b.get(x).getBrand().contains("a")||b.get(x).getBrand().contains("e")) {
//				System.out.println(b.get(x)+" is contains vowels ");
//			}                                                            //forEachLAMDA vowels
//			else {     
//				System.out.println(b.get(x)+ "is contains not vowels");
//			}
//		});
		
//		HashMap<Integer,Bike>sportbike=new HashMap<>();
//		HashMap<Integer,Bike>mountainbike=new HashMap<>();
//		
//		for(Integer x:b.keySet()) {
//			if(b.get(x).getIsPetrol()==true) {                      
//				sportbike.put(x,b.get(x));                                    //store hashMap
//			}
//			else {
//				mountainbike.put(x,b.get(x));
//			}
//		}
//		sportbike.values().forEach(x->System.out.println(x));
		
//		Bike max=b1;
//		for(Bike x:b.values()) {
//			if(max.getPrice()<x.getPrice()) {                           //max using values ehance for
//				max=x;
//			}
//		}
//		System.out.println(max);
		
//		for(Bike x:b.values()) {
//			if(x.getBrand().contains("a")||x.getBrand().contains("e")||x.getBrand().contains("i")) {
//				System.out.println(x.getBrand() +" contains vowels");
//			}                                                         //vowels using values enhance for
//			else {
//				System.out.println(x.getBrand()+" not contains vowels");
//			}
//		}
		
//		b.values().forEach(x->{
//			if(x.getBrand().contains("a")||x.getBrand().contains("e")||x.getBrand().contains("i")) {
//				System.out.println(x.getBrand()+" is contain vowels");
//			}                                                               //vowels using values forEachLamda
//			else {
//				System.out.println(x.getBrand()+" is not contain vowels");
//			}
//		});
		HashMap<Integer,Bike>mountainbike=new HashMap<>();
		HashMap<Integer,Bike>sportsbike=new HashMap<>();
		
		for(Bike x:b.values()) {                      //doubt
			if(x.getIsPetrol()==true) {
				mountainbike.put(x.getPrice(),x) ;          
			}
				}
		mountainbike.values().forEach(x->System.out.println(x));
		
  //		b.forEach((x,y)->{
//			if(y.getIsPetrol()==true) {
//				mountainbike.put(x,y);
//			}
//			else {                                              //store hashMap foreach
//				sportsbike.put(x, y);                                  
//			}
//		});
//		mountainbike.forEach((x,y)->System.out.println(x+" "+y));	
	}
}

	


