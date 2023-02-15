importjava.util.*;  
class TestJavaCollection1
{  
public static void main(String args[])
{  
ArrayList<String>al=new ArrayList<String>();    //Creating arraylist
al.add("RVR");//Adding object in arraylist
al.add("JC");  
al.add("CE");  
al.add("CSE");  
//Traversing list through Iterator  
Iterator itr=al.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next());  
}  
}  
}  
