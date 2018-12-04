import java.applet.*;
import java.awt.Graphics;
import java.awt.*;

public class image extends Applet {
	Image pic;
	public void init()
	{
		pic = getImage(getDocumentBase(), "image.jpg");
	}

	public void paint(Graphics g)
	{
		g.drawImage(pic, 30, 30, this);
	}

}

/*
<applet code="image.class" width="300" height="300">
</applet>
*/