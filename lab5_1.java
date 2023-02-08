class Area
{
	int area()
	{
		return 0;
	}
	int area(int length)
	{
		return length*length;
	}
	int area(int length,int breadth)
	{
		return length*breadth;
	}
}
class Box
{
	public static void main(String[] args)
	{
		int res;
		Area a=new Area();
		res=a.area();
		System.out.println("No arguments are passed ::  Area of box : "+res);
		res=a.area(3);
		System.out.println("One argument is passed ::  Area of box : "+res);
		res=a.area(10,15);
		System.out.println("Two arguments are passed ::  Area of box : "+res);	
	}
}