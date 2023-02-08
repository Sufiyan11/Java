package p2;
class Underived_new_package
{
	void variables()
		{
			p1.Protection p=new p1.Protection();
			System.out.println("Derive Package class method.");
			//System.out.println("def = "+p.def);
			System.out.println("We cannot access default members ouside the package ");
			//System.out.println("pri = "+p.pri);
			System.out.println("We cannot access private members ouside the package ");
			//System.out.println("pro = "+p.pro);
			System.out.println("We cannot access proected members ouside the package of underived class");
			System.out.println("pub = "+p.pub);
		}
}