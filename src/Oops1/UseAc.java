package Oops1;

public class UseAc {
	public static void main(String[]args) {
		Compreser com1=new Compreser(1500,"haier",true);
		com1.setBrand("hii");
		Ac a1=new Ac("Haier",15000,"green",com1);
		System.out.println(a1.getCompresr().getBrand());
		System.out.println(a1);
	}

}
