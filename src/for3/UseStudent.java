package for3;

public class UseStudent {
	public static void main(String[]args) {
		String a[]=args[0].split(" ");
		int x=Integer.parseInt(a[0]);
		String y=a[1];
		String z=a[2];
		
		Student student1=new Student();
		student1.id=Integer.parseInt(a[0]);
		student1.name=a[1];
		student1.degree=a[2];
		
		System.out.println(student1.id+" "+student1.name+" "+student1.degree);
		

		
		
		 
		
	
		
		
		
		
		
		
	
		
		
		
		
	}

}
