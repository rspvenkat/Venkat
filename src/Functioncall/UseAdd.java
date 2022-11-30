package Functioncall;

public class UseAdd {
	public static void main(String[] args) {
		Add ad=new Add();
		int d=Integer.parseInt(args[0]);
		int e=Integer.parseInt(args[1]);
		System.out.println(ad.add(d,e));
	}

}
