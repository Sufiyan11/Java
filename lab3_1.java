class Outer
{
int Outer_x=123;
void test()
{
Inner obj=new Inner();
obj.display();
}
class Inner
{
void display()
{
System.out.println("The value of x : "+Outer_x);
}
}
}
class InnerClassDemo
{
public static void main(String[] args)
{
Outer obj=new Outer();
obj.test();
}
}