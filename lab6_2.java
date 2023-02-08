import java.util.*;
interface Students
{
	void getvalue();
}
interface Department
{
	void getattendense();
}
class Exam implements Students,Department
{
	int sno;
	double attendense[]=new double[6];
	double finale;
	String sname,Class;
	Scanner scan=new Scanner(System.in);
	public void getvalue()
	{
		System.out.println("Enter-> sno ::  name :: class ");
		sno=scan.nextInt();
		sname=scan.next();
		Class=scan.next();
	}
	public void getattendense()
	{
		System.out.println("Enter -> attendense for last 6 months:");
		for(int i=0;i<6;i++)
		{
			attendense[i]=scan.nextDouble();
		}
	}
	void calattendense()
	{
		double sum=0;
		for(int i=0;i<6;i++)
			sum+=attendense[i];
		finale=sum/6;
	}
	boolean eligible()
	{
		if (finale>=75)
			return true;
		else
			return false;
	}
}
class testExam
{
	public static void main(String[] args)
	{	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no.of students : ");
		int n=scan.nextInt();
		Exam e[]=new Exam[n];
		for(int i=0;i<n;i++)
		{	
			Exam stu=new Exam();
			stu.getvalue();
			stu.getattendense();
			stu.calattendense();
			e[i]=stu;
		}
		for(int i=0;i<n;i++)
		{
			if(e[i].eligible())
				System.out.println(e[i].sname+" ["+e[i].sno+"] is eligible to write exam.");
			else
				System.out.println(e[i].sname+" ["+e[i].sno+"] is not eligible to write exam.");
		}
	}
}

