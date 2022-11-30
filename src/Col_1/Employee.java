package Col_1;

import java.util.ArrayList;
public class Employee {
	public static void main(String[]args) {
		int emp1=414;
		int emp2=444;
		int emp3=555;
		int emp4=658;
		int emp5=858;
		ArrayList<Integer>num=new ArrayList<>();
		num.add(emp1);
		num.add(emp2);
		num.add(emp3);
		num.add(emp4);
		num.add(emp5);
		//num.forEach(x->System.out.println(x));
		
		int max=num.get(0);
		
		for(int i=0;i<num.size();i++) {
			if(max<num.get(i)) {
				max=num.get(i);
			}		
		}
		System.out.println(max);

		
		
	}

}
