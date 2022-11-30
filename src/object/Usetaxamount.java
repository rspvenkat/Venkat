package object;

public class Usetaxamount {
	public static void main(String[]args) {
		Taxamont taxamount1=new Taxamont();
		taxamount1.orignalprice=1750;
		taxamount1.taxpercentage=50;
		taxamount1.taxamoun=(taxamount1.orignalprice*taxamount1.taxpercentage/100);
		System.out.println(taxamount1.taxamoun);
		
		
		
	}

}
