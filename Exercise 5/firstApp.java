import java.awt.*;
import java.applet.Applet;

/*<applet code = "firstApp" width=500 height=500> </applet>*/

public class firstApp extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(Color.GREEN);
        g.drawOval(35,25,125,135);
        g.fillOval(35,25,125,135);
        g.setColor(Color.WHITE);
        g.setFont(new Font ("Times New Roman",Font.BOLD,20));
        g.drawString("Circle",80,80);

        g.setColor(Color.RED);
        g.drawRect(235,45,125,135);
        g.fillRect(235,45,125,135);
        g.setColor(Color.WHITE);
        g.setFont(new Font ("Times New Roman",Font.BOLD,20));
        g.drawString("Square",250,80);

        g.setColor(Color.BLUE);
        g.drawOval(25,235,325,135);
        g.fillOval(25,235,325,135);
        g.setColor(Color.WHITE);
        g.setFont(new Font ("Times New Roman",Font.BOLD,20));
        g.drawString("Oval",150,290);
       
    }
}