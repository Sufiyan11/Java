import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="AWT2" width=300 height=300></applet>*/
public class AWT2 extends Applet implements ActionListener
{
	String msg;
	public void init(){
		Button yes,no,other;
		setBackground(Color.green);
		yes=new Button("YES");
		no=new Button("NO");
		other=new Button("Undecided");
		add(yes);
		add(no);
		add(other);
		yes.addActionListener(this);
		no.addActionListener(this);
		other.addActionListener(this);
	}
	public void actionPerformed(ActionEvent a)
	{
		String s=a.getActionCommand();
		if(a.equals("YES")) msg="You are Good to go";
		else if(a.equals("NO")) msg="You are not allowed";
		else msg="You can Wait.";
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,10,150);
		setBackground(Color.yellow);
	}
}