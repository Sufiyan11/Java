import javax.swing.*;  
class scrollbar
{  
  scrollbar
  {  
    JFrame jf= new JFrame("Scrollbar");  
    JScrollBar s=new JScrollBar();  
    s.setBounds(100,100, 50,100);  
    jf.add(s);  
    jf.setSize(400,400);  
    jf.setLayout(null);  
    jf.setVisible(true);  
  }  
  public static void main(String args[])  
  {  
     new scrollbar();
  }
}  
