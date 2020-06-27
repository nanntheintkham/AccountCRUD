package Exercise;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.*;



@SuppressWarnings("removal")
public class Login extends JFrame implements ActionListener
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton[] btn ;
	private JButton btnenter, btnClear;
	private int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
	private JPasswordField pwd;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login()
	{
		setTitle("Log in");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 212);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 5, 0, 0));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		
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
		
		btn = new JButton[10];
		shuffle(array);
		
		for(int i = 0; i < 10; i++)
		{
			btn[i] = new JButton(array[i] + "");
			panel.add(btn[i]);
			btn[i].addActionListener(this);
			
		}
		
		
	}
	
	public void shuffle(int[] array)
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
				JOptionPane.showMessageDialog(rootPane, "Login Success!");
			}
			
			else
			{
				JOptionPane.showMessageDialog(rootPane, "Wrong Password");
			}
		}
		
		if(e.getSource() == btnClear)
			pwd.setText("");
		
	}
	

	

}
