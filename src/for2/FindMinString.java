package for2;

public class FindMinString {
	public static void main(String[]args) {
		String[] name=new String[3];
		name[0]="venkatesh";
		name[1]="deva";
		name[2]="arun";
		String min=name[1];
		
		for(int i=0;i<name.length;i++) {
			
			if(name[i].length()<=min.length()) {
				min=name[i];
				
			}
		}
		System.out.println(min);
			
		
		
	}

}
