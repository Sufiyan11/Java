import java.io.*;
import java.util.*;
class Employee
{
    String name,id;
    long salary;
    int time;
    Scanner scan=new Scanner(System.in);
    void getInfo()
    {
	name=scan.next();
	id=scan.next();
	salary=scan.nextLong();
	time=scan.nextInt();
    }
    void AddSal()
    {
	if(salary<500)
	{
	    salary=salary+10;
	}
    }
    void AddWork()
    {
	if(time>6)
	{
	   salary=salary+5;
	}
    }
    void display()
    {
	System.out.println(name+"    "+id+"    "+salary);
    }
}

class EmployeeList
{
    public static void main(String[] args)
    {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the number of Employees : ");
	int n=scan.nextInt();
	Employee arr[]=new Employee[n];
	System.out.println("Enter the details of"+n+"Employees:");
	System.out.println("Name :: Id :: salary :: Time_of_work");
	for(int i=0;i<n;i++)
	{
	    System.out.println("Enter Details :");
	    Employee e=new Employee();
	    e.getInfo();
	    e.AddSal();
	    e.AddWork();	
	    arr[i]=e;
	}
	System.out.println("Name  ::   Id   ::  Salary");
	for(int i=0;i<n;i++)
	{
	    arr[i].display();
	}
   }
}  
	    
