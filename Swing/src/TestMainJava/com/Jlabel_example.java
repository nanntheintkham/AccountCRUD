package TestMainJava.com;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;

public class Jlabel_example
{
	JFrame f;
	JLabel ltext, limg;
	
	public void Draw()
	{
		ltext = new JLabel("I am smth");
		limg = new JLabel("Jimin", new ImageIcon("C:/Users/Nan/Desktop/BTS/734324.jpg"), JLabel.CENTER);
		
		ltext.setFont(new Font("Times New Roman", Font.BOLD, 16));
		ltext.setBackground(Color.LIGHT_GRAY);
		ltext.setForeground(Color.CYAN);
		ltext.setOpaque(true);
		
		f = new JFrame("JFrame Example");
		f.setSize(400, 300);
		f.setLayout(new GridLayout(2, 1));
		f.add(ltext);
		f.add(limg);
		f.setVisible(true);
	}
	
	public static void main(String args[])
	{
		Jlabel_example j = new Jlabel_example();
		j.Draw();
	}
}
