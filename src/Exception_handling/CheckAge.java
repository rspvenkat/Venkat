package Exception_handling;

public class CheckAge {
	public static void main(String[] args) throws AgeException {
		try {
		int age = 17;
		if (age<18) {
			throw new AgeException("not eliglble");
		}
		else {
			System.out.println("eligible");
		}
		}
		finally {
		System.out.println("end");
		}	
	}

}
