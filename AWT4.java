import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="AWT4" width=300 height=300></applet>*/
public class AWT4 extends Applet implements ItemListener
{
	String msg;
	CheckboxGroup cg;
	Checkbox male,female,other;
	public void init(){
		cg = new CheckboxGroup();
		setBackground(Color.green);
		male=new Checkbox("Male",cg,true);
		female=new Checkbox("Female",cg,false);
		other=new Checkbox("Other",cg,false);
		add(male);
		add(female);
		add(other);
		male.addItemListener(this);
		female.addItemListener(this);
		other.addItemListener(this);
	
	}
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		if(male.getState()){
			 msg=" You are MALE  ";	
			setBackground(Color.red);
		}
		if(female.getState()){	
			 msg=" You are FEMALE  ";
			setBackground(Color.red);
		}
		if(other.getState()){
			 msg=" You are OTHER  ";
			setBackground(Color.red);
		}
		g.drawString(msg,10,190);		
		
	}
}