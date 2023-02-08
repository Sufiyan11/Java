import java.applet.*;
import java.awt.*;
/*<applet code="Myapplet" width=300  height=300 >
<param name="name" value="Sufiyan.Shaik">
<param name="designation" value="Student">
<param name="Rollno" value="Y21CS162">
<param name="department" value="CSE">
<param name="college" value="RVR & JC College of Engineering">
</applet>*/
public class Myapplet extends Applet
{
public void paint(Graphics g)
{
setBackground(Color.yellow);
g.setColor(Color.red);
g.drawString("Name :"+getParameter("name"),20,20);
g.setColor(Color.green);
g.drawString("Designation :"+getParameter("designation"),40,40);
g.setColor(Color.black);
g.drawString("Roll NO : "+getParameter("Rollno"),60,60);
g.setColor(Color.blue);
g.drawString("Department :"+getParameter("department"),80,80);
g.setColor(Color.orange);
g.drawString("College :"+getParameter("college"),100,100);
g.setColor(Color.black);
g.drawLine(0,0,115,115);
g.drawLine(115,115,440,115);
g.drawLine(440,115,325,0);
g.drawLine(43,43,370,43);
g.drawLine(23,23,345,23);
g.drawLine(63,63,385,63);
g.drawLine(83,83,410,83);
g.drawLine(0,0,320,0);
}
}
