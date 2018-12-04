import java.applet.*;
import java.awt.*;
import java.net.*;
import java.awt.event.*;

public class link extends Applet implements ActionListener
{
	public void init()
	{
		String link = "yahoo";
		Button b = new Button(link);
		b.addActionListener(this);
		add(b);
	}

	public void actionPerformed(ActionEvent ae)
	{
		Button src = (Button)ae.getSource();
		String link = "http://www" + src.getLabel()+".com";
		try {
			AppletContext a = getAppletContext();
			URI u = new URI(link);
			//a.showDocument(u, "_blank");
			Desktop d = Desktop.getDesktop();
			d.browse(u);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

/*
<applet code="link.class" width="300" height="300">
</applet>
*/