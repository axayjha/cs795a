import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
public class color extends Applet {
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.drawLine(30, 300, 200, 10);
		g.setColor(Color.BLUE);
		g.fillOval(60, 90, 100, 100);
	}
}

/*
<applet code="color.class" width="300" height="300">
</applet> 
*/