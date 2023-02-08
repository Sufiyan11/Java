import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Keyevents" width=300 height=100></applet>*/
public class Keyevents extends Applet implements KeyListener
{
	String msg = "";
	int X = 10, Y = 20;
	public void init() 
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke) 
	{
		setBackground(Color.BLUE);
		showStatus("Key Pressed");
	}
	public void keyReleased(KeyEvent ke) 
	{
		setBackground(Color.GREEN);
		showStatus("Key Released");
	}
	public void keyTyped(KeyEvent ke) 
	{	
		msg += ke.getKeyChar();
		repaint();
	}
	public void paint(Graphics g) 
	{
		g.drawString(msg, X, Y);
	}
}