package GUI;

import java.awt.BorderLayout;
import javax.swing.*;

public class Mainframe extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TextPanel txt;
	private Toolbar tool;
	private FormPanel form;
	
	public Mainframe()
	{
		super("Hello World");
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout(new BorderLayout());
		
		tool = new Toolbar();
		txt = new TextPanel();
		form = new FormPanel();
		
		tool.setStringListener(new StringListener()
		{
			
			@Override
			public void textEmitter(String text)
			{
				txt.appendText(text);
				
			}
		});
		
		form.setFormListener(new FormListener()
		{
			public void EventOccured(FormEvent e)
			{
				String name = e.getName();
				String occupation = e.getOccupation();
				
				txt.appendText(name + " : " + occupation + "\n");
			}
		});
		add(tool, BorderLayout.NORTH);
		add(txt, BorderLayout.CENTER);
		add(form, BorderLayout.WEST);
	}
}
