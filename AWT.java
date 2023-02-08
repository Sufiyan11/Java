import java.awt.*;
import java.applet.*;
/*<applet code="AWT" width=300 height=300></applet>*/
public class AWT extends Applet
{
	Label one,two,three;
	public void init(){
		one=new Label("ONE",Label.RIGHT);
		two=new Label("TWO");
		three=new Label("THREE");
		add(one);
		add(two);
		add(three);
		setBackground(Color.green);
	}
}