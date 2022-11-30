package for3;

public class UseEmp {
	public static void main(String[]args) {
		Emp emp1=new Emp();
		emp1.id=111;
		emp1.mail="RSpevenkat@gmail.com";
		emp1.name="venkat";
		emp1.salary=15000;
		Emp emp2=new Emp();
		emp2.id=122;
		emp2.mail="VENkatesh99@gmail.com";
		emp2.name="hari";
		emp2.salary=100000;
		Emp emp3=new Emp();
		emp3.id=133;
		emp3.mail="venkat9999@gmail.com";
		emp3.name="mani";
		emp3.salary=35000;
		
		Emp[] empl= {emp1,emp2,emp3};
		
		int max=empl[0].salary;
		String mailname="";
		                 
		//int uppercasecount=0;
		
		for(int i=0;i<empl.length;i++) {
			if(empl[i].salary>=max) {
				max=empl[i].salary;
				//mailname=empl[i].mail;
			}
	}
		System.out.println(max);

		System.out.println(mailname);
		//System.out.println(uppercasecount);
		int uppercount=0;
		int lowercount=0;
		int numcount=0;
		int scount=0;
		
		char [] a=mailname.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(a[i]>='A'&&a[i]<='Z') {
				uppercount++;
				
			}
			else if(a[i]>='a'&&a[i]<='z') {
				lowercount=lowercount+1;
			}
			else if(a[i]>='0'&&a[i]<='9') {
				numcount=numcount+1;
			}
			else
				scount=scount+1;
		}
		System.out.println("Uppercase ="+uppercount+" Lowercase count ="+lowercount+" Number count= "+numcount+" specialsymbol count "+scount );

	}

			
		

}

