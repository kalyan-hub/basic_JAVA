12.1)
import java.awt.*;
import java.applet.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
/*<applet code="Key.class"width="300"height="200"></applet>*/
public class Key extends Applet implements KeyListener
{
String msg="";
int x=10,y=20;
public void init()
{
addKeyListener(this);
}
public void keyPressed(KeyEvent k)
{
showStatus("Key Down");
}
public void keyReleased(KeyEvent k)
{
showStatus("Key Up");
}
public void keyTyped(KeyEvent k)
{
msg=msg+k.getKeyChar();
showStatus("Key Typing");
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg, x,y);      
}          
}
