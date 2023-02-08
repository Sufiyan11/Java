import javax.swing.*;    
public class jtable
{        
  jtable()
  {    
    JFrame jf=new JFrame();    
    String data[][]={ {"162","Sufiyan","970000"},    
                      {"164","Shreyas","780000"},    
                      {"185","Tayyab","700000"} };    
    String column[]={"ID","NAME","SALARY"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    jf.add(sp);          
    jf.setSize(300,400);    
    jf.setVisible(true);    
   }     
   public static void main(String[] args) 
   {    
     new jtable();   
   }    
}  