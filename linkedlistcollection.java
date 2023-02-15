importjava.util.*;  
public class TestJavaCollection2
{  
public static void main(String args[])
{  
LinkedList<String>ll=new LinkedList<String>();  
ll.add("RVR");  
ll.add("JC");  
ll.add("CE");  
ll.add("CSE");  
Iterator<String>itr=ll.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
