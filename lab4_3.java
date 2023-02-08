import java.util.*;
class employee
{
	String name,id;
	double salary;
	void reademp()
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the details of employee ::");
	System.out.print("Name : ");
	name=scan.next();
	System.out.print("Id : ");
	id=scan.next();
	System.out.print("Salary : ");
	salary=scan.nextDouble();
	}
}
class  permanent_employee extends employee
{
	void increment()
	{
		salary=salary+salary*0.0035;
	}
	void print_emp()
	{
		System.out.println(name+"  "+id+"  "+salary);
	}
}
class  temporary_employee extends employee
{
	void increment()
	{
		salary=salary+salary*0.05;
	}
	void print_emp()
	{
		System.out.println(name+"  "+id+"  "+salary);
	}
}
class employeeList
{
public static void main(String[] args)
{
	permanent_employee emp1=new permanent_employee();
	emp1.reademp();
	emp1.increment();
	temporary_employee emp2=new temporary_employee();
	emp2.reademp();
	emp2.increment();
	System.out.println("Details of Employees : ");
	System.out.println("Name    Id    Salary");
	emp1.print_emp();
	emp2.print_emp();
}
}

