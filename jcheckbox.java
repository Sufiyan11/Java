import javax.swing.*;  
public class jcheckbox
{  
  jcheckbox()
  {  
    JFrame jf= new JFrame("CheckBox Example");  

    JCheckBox c1 = new JCheckBox("C++");  
    c1.setBounds(100,100, 50,50);  

    JCheckBox c2 = new JCheckBox("Java", true);  
    c2.setBounds(100,150, 50,50);  

    jf.add(c1);  
    jf.add(c2);  

    jf.setSize(400,400);  
    jf.setLayout(null);  
    jf.setVisible(true);  
  }
  
  public static void main(String args[])  
  {  
       new jcheckbox();  
  }
}  
