import java.util.*; 
class student
{
	String name,roll_no;
}
class test extends student
{
	int m[]=new int[6];
}
class result extends test
{
	int total=0;
	void getInfo()
	{	
		Scanner scan=new Scanner(System.in);
		System.out.println("Name :: Roll_no");
		name=scan.next();
		roll_no=scan.next();
		System.out.println("Enter the marks of 6 subjects :");
		for(int i=0;i<6;i++)
		{
			m[i]=scan.nextInt();
			total=total+m[i];
		}
	}	
	void display()
	{
		System.out.println(name+"  "+roll_no+"  "+total);
	}
}
class studentList
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the number of students : ");
	int n=scan.nextInt();
	result s[]=new result[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter Student"+i+" details :: ");
		result r=new result();
		r.getInfo();
		s[i]=r;
	}
	System.out.println("Name    Roll_no    Total_Marks");
	for(int i=0;i<n;i++)
	{
		s[i].display();
	}
}
}