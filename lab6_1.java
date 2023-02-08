abstract class Shape
{
double l,b;
abstract void PrintArea();
}
class Rectangle extends Shape
{
Rectangle(int m,int n)
{
l=m;
b=n;
}
void PrintArea()
{
System.out.println("Area of rectaangle : "+l*b);
}
}
class Triangle extends Shape
{
Triangle(int m,int n)
{
l=m;
b=n;
}
void PrintArea()
{
System.out.println("Area of Triangle : "+0.5*l*b);
}
}
class Circle extends Shape
{
Circle(int m)
{
l=m;
}
void PrintArea()
{
System.out.println("Area of Circle : "+3.14*l*l);
}
}
class test
{
public static void main(String[] args)
{
Rectangle r=new Rectangle(12,34);
r.PrintArea();
Triangle t=new Triangle(17,29);
t.PrintArea();
Circle c=new Circle(15);
c.PrintArea();
}
}