import javax.swing.*; 

class jlabel
{  
  public static void main(String args[])  
  {  
     JFrame jf = new JFrame("JLabel Example"); 

     JLabel jf1,jf2;
  
     jf1=new JLabel("SHAIK");  
     jf1.setBounds(60,60, 100,30);  

     jf2=new JLabel("SUFIYAN");  
     jf2.setBounds(70,70, 100,30); 

     //adding the jlabels to the applet window
     jf.add(jf1); 
     jf.add(jf2); 

     jf.setSize(300,300);  
     jf.setLayout(null); 
     jf.setVisible(true);  
  }  
}  