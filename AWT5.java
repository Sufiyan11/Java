// Demonstrate text field.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="AWT5" width=380 height=150>
</applet>
*/
public class AWT5 extends Applet implements ActionListener 
{
AWT5 name, pass;
public void init() 
{
Label namep = new Label("Name: ", Label.RIGHT);
Label passp = new Label("Password: ", Label.RIGHT);
name = new AWT5(12);
pass = new AWT5(8);
pass.setEchoChar('?');
add(namep);
add(name);
add(passp);
add(pass);
// register to receive action events
name.addActionListener(this);
pass.addActionListener(this);
}
// User pressed Enter.
public void actionPerformed(ActionEvent ae) {
repaint();
}
public void paint(Graphics g) {
g.drawString("Name: " + name.getText(), 6, 60);
g.drawString("Selected text in name: "
+ name.getSelectedText(), 6, 80);
g.drawString("Password: " + pass.getText(), 6, 100);
}
}