class stringbuffer
{
	public static void main(String[] args)
	{
		StringBuffer name=new StringBuffer("  Welcome to Java");
		StringBuffer s1=new StringBuffer("class ");
		System.out.println("Taken String : "+name);
		System.out.println("Length of string  : "+name.length());
		System.out.println("Capacity of string : "+name.capacity());
		System.out.println("character at index 6 : "+name.charAt(6));
		name.delete(13,17);
		System.out.println("removing 'Java' in string : "+name);
		System.out.println("Index of 'to' in string : "+name.indexOf("to"));
		name.append(s1);
		System.out.println("Adding '"+s1+"' to string : "+name);
		name.insert(13,"the ");
		System.out.println("Inserting 'the' into string : "+name);
		System.out.println("Substring of given string from index 9 : "+name.substring(9));
		System.out.println("Index of 'a' from end of string : "+name.lastIndexOf("a"));
		name.reverse();
		System.out.println("Reverse of given string : "+name);		
	}
}		