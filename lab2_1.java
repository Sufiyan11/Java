class staticdemo
{
static int a=2;
static int b;
static void demo(int num)
{
System.out.println("Numbers :\nx="+num+"\na="+a+"\nb="+b);
}
static
{
System.out.println("Static block");
b=4*a+6;
}
public static void main(String[] args)
{
staticdemo s=new staticdemo();
demo(12);
}
}