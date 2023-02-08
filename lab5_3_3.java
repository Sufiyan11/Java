final class Final
{
void File()
{
System.out.println("Final File.");
}
}
class test extends Final
{
public static void main(String[] args)
{
test t=new test();
t.File();
}
}