import java.awt.*;
import java.applet.*;
/*<applet code="lab12" width=300 height=200></applet>*/
public class lab12 extends Applet
{
	public void paint(Graphics g)
	{
		Color c1 = new Color(255, 100, 100);
		Color c2 = new Color(100, 255, 100);
		Color c3 = new Color(100, 100, 255);
		g.setColor(c1);
		g.drawLine(0, 0 ,70, 70);
		g.setColor(Color.red);
		g.drawOval(10, 10, 50, 50);
		g.fillOval(70, 90, 140, 140);
		g.setColor(Color.blue);
		g.drawRect(10, 10, 60, 50);
		g.setColor(Color.cyan);
		g.fillRect(100, 10, 60, 50);
		g.drawRoundRect(190, 10, 60, 50, 15, 15);
		g.fillRoundRect(210, 190,60, 50, 15, 15);
	}
}