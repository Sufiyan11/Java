package p1;
class Underived
{
	void variables()
		{
			Protection p=new Protection();
			System.out.println("Underived class method.");
			System.out.println("def = "+p.def);
			//System.out.println("pri = "+p.pri);
			System.out.println("We cannot access private members ouside the class ");
			System.out.println("pro = "+p.pro);
			System.out.println("pub = "+p.pub);
		}
}