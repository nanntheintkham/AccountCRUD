package TestMainJava.com;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonEg
{
	protected JButton b1, b2;
	protected JFrame f;
	
	public void Track()
	{
		b1 = new JButton("Jungkook");
		b1.setBounds(140, 100, 120, 40);
		b1.addActionListener(act);
		
		b2 = new JButton("Jimin");
		b2.setBounds(140, 150, 120, 40);
		b2.addActionListener(act);
		
		f = new JFrame();
		f.add(b1);
		f.add(b2);
		f.setSize(400, 500);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	private ActionListener act = new ActionListener()
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == b1)
				msg1();
			else if(e.getSource() == b2)
				msg2();
			
		}

	};
	
	void msg1()
	{
		JOptionPane.showMessageDialog(null, "Jungkookie (Bunny)", "Jimin's", JOptionPane.INFORMATION_MESSAGE );
	}
	
	void msg2()
	{
		JOptionPane.showMessageDialog(null, "Jiminie (Mochi)", "Jungkook's", JOptionPane.PLAIN_MESSAGE );
	}
	
	public static void main(String args[])
	{
		JButtonEg je = new JButtonEg();
		je.Track();
	}
}
