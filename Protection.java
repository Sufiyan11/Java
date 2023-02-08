package p1;
public class Protection
{
	int def=10;
	private int pri=11;
	protected int pro=12;
	public int pub=13;
	
	void variables()
	{
		System.out.println("Base method.");
		System.out.println("def = "+def);
		System.out.println("pri = "+pri);
		System.out.println("pro = "+pro);
		System.out.println("pub = "+pub);
	}
}