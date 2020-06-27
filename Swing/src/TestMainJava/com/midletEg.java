package TestMainJava.com;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class midletEg extends MIDlet
{
	private Display display;
    // TextBox to display text
    TextBox box = null;
    
	@Override
	protected void destroyApp(boolean arg0) throws MIDletStateChangeException
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void pauseApp()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void startApp() throws MIDletStateChangeException
	{
		 display = Display.getDisplay(this);
	        box = new TextBox("Simple Example", "Hello World", 20, 0);
	        display.setCurrent(box);
		
	}
	
}
