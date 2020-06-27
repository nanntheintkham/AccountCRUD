package TestMainJava.com;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class newApp
{
	public static void main(String args[])
	{
		JFrame f = new JFrame();
		
		JButton b = new JButton("Click");
		b.setBounds(140,100,120, 40);
		
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(f, "Hello..", "Greetings", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		f.add(b);
		
		f.setSize(400, 500);
		f.setLayout(null);
		f.setVisible(true);
	}
}
