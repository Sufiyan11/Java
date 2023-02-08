class finalmethod
{
final void work()
{
	System.out.println("Work Hard");
}
}
class test extends finalmethod
{
void work()
{
System.out.println("Work Smart");
}
public static void main(String[] srgs)
{
test t=new test();
t.work();
}
}