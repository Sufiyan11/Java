class testthis
{
int a,b,c;
testthis()
{
this(1,2,3);
System.out.print("Sides of trinagle : ");
}
testthis(int a,int b,int c)
{
this.a=a;
this.b=b;
this.c=c;
}
void display()
{
System.out.println("\na="+a+" b="+b+" c="+c);
}
public static void main(String[] args)
{
testthis a=new testthis();
a.display();
}
}