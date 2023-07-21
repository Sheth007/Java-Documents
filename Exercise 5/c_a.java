import java.awt.*;
import java.applet.*;

/*<applet code="c_a" width=500 height=500> </applet>*/

public class c_a extends Applet
{
    public void paint(Graphics g)
    {
        g.setFont(new Font("Times New Roman",Font.BOLD,20));
        g.drawString("Add First number ",60,60);
        g.drawString("Add Second number ",60,80);
        g.drawString("Total ",60,100);
    }
    public void init()
    {
        Checkbox c1=new Checkbox ("ADD");
        Checkbox c2=new Checkbox ("SUB");
        Checkbox c3=new Checkbox ("MUL");
        Checkbox c4=new Checkbox ("DIV");
        Checkbox c5=new Checkbox ("CANCEL");
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);
    }
}