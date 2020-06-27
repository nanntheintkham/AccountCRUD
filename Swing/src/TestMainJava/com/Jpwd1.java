package TestMainJava.com;

import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;

public class Jpwd1
{
	JFrame jframe;
	JPasswordField pwd;
	JLabel jlab;
	JButton b1;
	
	public static void main(String args[])
	{
		Jpwd1 jp = new Jpwd1();
		jp.Draw();
	}
	
	public void Draw()
	{
		pwd = new JPasswordField(20);
		jlab = new JLabel();
		b1 = new JButton("Display password");
		
		b1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				char[] p = pwd.getPassword();
				String pp = "";
				for(int i = 0; i < p.length; i++)
				{
					pp += p[i];
				}
				jlab.setText(pp);
				Arrays.fill(p, '0');
			}
		});
		
		jframe = new JFrame("Simple Password Example");
		jframe.setSize(300, 200);
		jframe.setLayout(new FlowLayout());
		jframe.add(pwd);
		jframe.add(b1);
		jframe.add(jlab);
		jframe.setVisible(true);
	}
}
