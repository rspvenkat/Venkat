package conditions;

public class AcTemp {
	public static void main(String[]args) {
		int temp= 16;
						if (temp>=16&&temp<20) {
			System.out.println("very cold weather");
		}
		else if(temp>=20&&temp<25) {
			System.out.println("cold weather");
		}
		else if(temp>=25&&temp<30) {
			System.out.println("normal");
		}
		else {
			System.out.println("invalid data");
		}
	}

}
