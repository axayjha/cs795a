import java.applet.Applet;
import java.awt.Graphics;
public class shapes extends Applet {
	public void paint(Graphics g) {
		g.drawLine(30, 300, 200, 10);
		g.drawOval(60, 90, 100, 100);
		g.drawRect(400, 50, 200, 100);
	}
}

/*
<applet code="shapes.class" width="700" height="400">
</applet> 
*/