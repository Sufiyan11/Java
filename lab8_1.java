
cclass string
{
	public static void main(String[] args)
	{
		String name="  Welcome to Java";
		String s1="Class",s2=" of Java   ";
		System.out.println("String : "+name); 
		System.out.println("Character at index 3 :"+name.charAt(3));
		System.out.println("Length of string :"+name.length());
		name=name.replace("Java",s1);
		System.out.println("Replacing 'java' with 'class' : "+name);
		System.out.println("Index of substring '"+s1+"' : "+name.indexOf(s1));
		System.out.println("Substring between indices 9 to end : "+name.substring(9));
		name=name.replace('e','a');
		System.out.println("Replacing 'e' with 'a' : "+name);
		name=name.concat(s2);
		System.out.println("Conctenateing : "+name);
		System.out.println("String into uppercase : "+name.toUpperCase());
		System.out.println("String into lowercase : "+name.toLowerCase());
		name=name.trim();
		System.out.println("Removing spaces at start and end of string : "+name);
	}
}