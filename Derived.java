package p1;
class Derived extends Protection
{
	void variables()
		{
			System.out.println("derived class method.");
			System.out.println("def = "+def);
			//System.out.println("pri = "+pri);
			System.out.println("Private members can be accessable in same class ");
			System.out.println("pro = "+pro);
			System.out.println("pub = "+pub);
		}
}