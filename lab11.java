import java.applet.*;
import java.awt.*;
/*<applet code="lab11" width=300  height=300 >
<param name="name" value="Sufiyan.Shaik">
<param name="designation" value="Student">
<param name="Rollno" value="Y21CS162">
<param name="department" value="CSE">
<param name="college" value="RVR & JC College of Engineering">
</applet>*/
public class lab11 extends Applet
{
public void paint(Graphics g)
{
setBackground(Color.LIGHT_GRAY);
g.setColor(Color.red);
g.drawString("Name :"+getParameter("name"),20,20);
g.setColor(Color.cyan);
g.drawString("Designation :"+getParameter("designation"),40,40);
g.setColor(Color.black);
g.drawString("Roll NO : "+getParameter("Rollno"),60,60);
g.setColor(Color.blue);
g.drawString("Department :"+getParameter("department"),80,80);
g.setColor(Color.MAGENTA);
g.drawString("College :"+getParameter("college"),100,100);
}
}