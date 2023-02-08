import javax.swing.*;    
public class jbutton
{  
  public static void main(String[] args) 
  {  
    JFrame jf = new JFrame("Button Example");  
    JButton b1 = new JButton("C");  
    b1.setBounds(50,50,50,50);  
    jf.add(b1);  
    JButton b2=new JButton("C++");  
    b2.setBounds(100,100,100,100);  
    jf.add(b2);
    jf.setSize(400,400);  
    jf.setLayout(null);  
    jf.setVisible(true);   
  }  
}  
