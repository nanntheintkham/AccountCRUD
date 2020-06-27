package Exercise;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.Random;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.TextBox;
import javax.microedition.midlet.*;

public class Login1 extends MIDlet implements ActionListener
{
	private JFrame f;
	private JPanel panel;
	private JButton[] btn ;
	private JButton btnenter, btnClear;
	private int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
	private JPasswordField pwd;
	private Display disp;
    TextBox b = null;
	
	public Login1()
	{
		f = new JFrame("Log In");
		f.setLayout(new BorderLayout());
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(2, 5, 0, 0));
		f.add(panel, BorderLayout.NORTH);
		
		btn = new JButton[10];
		shuffle(array);
		
		for(int i = 0; i < 10; i++)
		{
			btn[i] = new JButton(array[i] + "");
			panel.add(btn[i]);
			btn[i].addActionListener(this);
			
		}
		
		JPanel panel_1 = new JPanel();
		f.add(panel_1, BorderLayout.CENTER);
		
		btnClear = new JButton("Clear");
		btnClear.setPreferredSize(new Dimension(89, 31));
		panel_1.add(btnClear);
		btnClear.addActionListener(this);
		
		pwd = new JPasswordField();
		pwd.setToolTipText("Enter Passcode");
		pwd.setEchoChar((char)0);
		pwd.setText("Enter Passcode");
		pwd.setPreferredSize(new Dimension(150, 31));
		panel_1.add(pwd);
		
		pwd.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e){
                pwd.setText("");
            }
		});
		
		btnenter = new JButton("Enter");
		btnenter.setPreferredSize(new Dimension(89, 31));
		panel_1.add(btnenter);
		btnenter.addActionListener(this);
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 450, 212);
		f.setVisible(true);
	}

	private void shuffle(int[] array)
	{

		Random ran = new Random();
		
		for(int i = 0; i < 10; i++)
		{
			int random = ran.nextInt(10);
			int temp = array[random];
			array[random] = array[i];
			array[i] = temp;
		}
		
	}

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
		disp = Display.getDisplay(this);
		b = new TextBox("Success", "Hello", 20, 0);
        disp.setCurrent(b);
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e)
	{
		int i;
		String inp ;
		String input = "";
		pwd.setEchoChar('*');
		
		for(i = 0; i < 10; i++)
		{
			if(e.getSource() == btn[i])
			{
				input = pwd.getText() + btn[i].getText();
				pwd.setText(input);
			}
			
			
		}
		
		if(e.getSource() == btnenter)
		{
			inp = String.valueOf(pwd.getPassword());
			if(inp.equals("13613"))
			{
				try
				{
					startApp();
				} catch (MIDletStateChangeException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			else
			{
				JOptionPane.showMessageDialog(f, "Wrong Password");
			}
		}
		
		if(e.getSource() == btnClear)
			pwd.setText("");
		
	}
	
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			
			@Override
			public void run()
			{
				new Login1();
				
			}
		});
	}

}
