import java.util.*;
class employee
{
	double NP,BP,HRA,DA,PF;
	String name="",id="",designation="";
	void reademp()
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the details of employee ::");
	System.out.print("Name : ");
	name=scan.next();
	System.out.print("Id : ");
	id=scan.next();
	System.out.print("Designation : ");
	designation=scan.next();
	}
}
class salary extends employee
{
	void readsal()
	{	
		super.reademp();
		Scanner scan=new Scanner(System.in);
		System.out.print("Basic pay(BP) : ");
		BP=scan.nextDouble();
		System.out.print("House Rent Allowance(HRA) :");
		HRA=scan.nextDouble();
		System.out.print("Dearness Allowance(DA) :");
		DA=scan.nextDouble();
		System.out.print("Provident Found (PF)");
		PF=scan.nextDouble();
	}
	void calculatesalary()
	{
		NP=BP+HRA+DA-PF;
	}
	void displayemp()
	{
		System.out.println(name+"  "+NP);
	}
}
class EmployeeList
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the numbers of employees : ");
		int n=scan.nextInt();
		salary empl[]=new salary[n];
		for(int i=0;i<n;i++)
		{
			salary s=new salary();
			s.readsal();
			s.calculatesalary();
			empl[i]=s;
		}
		System.out.println("NAME     SALARY ");
		for(int i=0;i<n;i++)
		{
			empl[i].displayemp();
		}
	}
}
		




