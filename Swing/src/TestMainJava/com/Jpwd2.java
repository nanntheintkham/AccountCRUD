package TestMainJava.com;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Jpwd2
{
	JFrame frame;
	JLabel lbl;
	JPasswordField pwdf;
	
	public static void main(String args[])
	{
		Jpwd2 j = new Jpwd2();
		j.Draw();
	}
	
	public void Draw()
	{
		pwdf = new JPasswordField(20);
		lbl = new JLabel();
		
		pwdf.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				lbl.setText("You just pressed Enter");				
			}
		});
		
		pwdf.addKeyListener(new KeyListener()
		{
			
			@Override
			public void keyTyped(KeyEvent e)
			{
				lbl.setText("You typed: " + e.getKeyChar());
				
			}
			
			@Override
			public void keyReleased(KeyEvent e)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e)
			{
				// TODO Auto-generated method stub
				
			}
		});
		
		frame = new JFrame("KeyListener Example");
		frame.setSize(300, 200);
		frame.setLayout(new FlowLayout());
		frame.add(pwdf);
		frame.add(lbl);
		frame.setVisible(true);
	}
}
