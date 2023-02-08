class figure
{
	int a=0,b=0;
	void getdimensions(int m,int n)
	{
		a=m;
		b=n;
	
	}
	double area()
	{
		System.out.print("Area of the two dimensional object -> ");
		return 0;
	}
}
class Rectangle extends figure
{
	double area()
	{
		return a*b;
	}
}
class Triangle extends figure
{
	double area()
	{
		return 0.5*a*b;
	}
}
class test
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		r.getdimensions(10,15);
		double r_area=r.area();
		Triangle t=new Triangle();
		t.getdimensions(12,15);
		double t_area=t.area();
		System.out.println("Area of the rectangle with sides :: length = "+r.a+" breadth = "+r.b+" --> "+r_area);
		System.out.println("Area of the Triangle with dimensions :: base_length = "+t.a+" height = "+t.b+" --> "+t_area);
	}
}