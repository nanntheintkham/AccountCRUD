package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btn1;
	private JButton btn2;
	private StringListener textListener;
		
	public Toolbar()
	{
		setBorder(BorderFactory.createEtchedBorder());
		btn1 = new JButton("Hello");
		btn2 = new JButton("Goodbye");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(btn1);
		add(btn2);
		
		
	}

	public void setStringListener(StringListener listener)
	{
		this.textListener = listener;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btn1)
			if(textListener != null)
			{
				textListener.textEmitter("Hello\n");
			}
		if(e.getSource() == btn2)
			if(textListener != null)
			{
				textListener.textEmitter("Goodbye\n");
			}
		
	}
}
