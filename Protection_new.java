package p2;
class Protection_new extends p1.Protection
{
	void variables()
		{
			System.out.println("Derive Package class method.");
			//System.out.println("def = "+def);
			System.out.println("We cannot access default members ouside the package ");
			//System.out.println("pri = "+pri);
			System.out.println("We cannot access private members ouside the package ");
			System.out.println("pro = "+pro);
			System.out.println("pub = "+pub);
		}
}