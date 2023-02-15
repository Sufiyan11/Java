importjava.util.*;  
classTestJavaCollection3
{  
public static void main(String args[])
{  
Vector<String> v=new Vector<String>();  
v.add("RVR");  
v.add("JC");  
v.add("CE");  
v.add("CSE");  
Iterator<String>itr=v.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next());  
}  
}  
}  
