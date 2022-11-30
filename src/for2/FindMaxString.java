package for2;

public class FindMaxString {
	public static void main(String[]args) {
		String[] name=new String[5];
		name[0]="venkat";
		name[1]="deva";
		name[2]="kalyanasundram";
		name[3]="abdulrahuman";
		name[4]="raja";
		
		String max=name[4]; 
		for(int i=0;i<name.length;i++) {
			if(name[i].length()>=max.length()) {
				max=name[i];
			}
		}
		System.out.println(max);
		
		
		
	}

}
