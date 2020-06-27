package TestMainJava.com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class jlabelaction extends Frame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField jf;
	JLabel jl;
	JButton jb;
	
	jlabelaction()
	{
		jf = new JTextField();
		jf.setBounds(50, 50, 150, 20);
		jl = new JLabel();
		jl.setBounds(50, 100, 250, 20);
		jb = new JButton("Find IP");
		jb.setBounds(50, 150, 95, 30);
		jb.addActionListener(this);
		add(jb);
		add(jf);
		add(jl);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		try {
			String host = jf.getText();
			String ip = java.net.InetAddress.getByName(host).getHostAddress();
			jl.setText("Ip of " + host + " is : " + ip);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	
	public static void main(String args[])
	{
		new jlabelaction();
	}}
