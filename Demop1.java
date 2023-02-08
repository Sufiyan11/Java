package p1;
public class Demop1
{
	public static void main(String[] args)
	{
		Protection p=new Protection();
		Derived d=new Derived();
		Underived u=new Underived();
		p.variables();
		d.variables();
		u.variables();
	}
}