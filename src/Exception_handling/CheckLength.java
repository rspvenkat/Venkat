package Exception_handling;

public class CheckLength {
	public static void main(String[] args) throws NameException{
		try {
		String name ="venk";
		if(name.length()<5) {
			throw new NameException("name length is below 5");
		}
		else {
			System.out.println(name);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("say hi");
		}
	}

}
