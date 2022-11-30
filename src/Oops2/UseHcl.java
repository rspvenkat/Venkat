package Oops2;

public class UseHcl {
	public static void main(String[]args) {
		HCL h1=new HCL(2000,"MUMBAI","HCL",true,5,"IT");
		HCL h2=new HCL(5000,"MADURAI","INFOSYS",false,8,"IT");
		HCL h3=new HCL(8000,"KOCHI","TCS",true,1,"IT");
		HCL h4=new HCL(1000,"CHENNAI","ZOHO",true,10,"IT");
		HCL h5=new HCL(8000,"THENI","EPI",false,10,"IT");
		HCL h6=new HCL(10000,"PUNE","DELL",true,11,"IT");
		
		HCL[] h= {h1,h2,h3,h4,h5,h6};
		/*for(int i=0;i<h.length;i++) {
			if(h[i].getNoofFloors()>3) {
				System.out.println(h[i]);
			}
		}*/
		for(HCL A:h) {
			if(A.getNoofFloors()<3) {
				System.out.print(A);
				
				
			}
		}
		
	





		
	}

}
