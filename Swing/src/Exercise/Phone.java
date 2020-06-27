package Exercise;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Phone extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btn2;
	private JButton btn3;
	private JButton btnCall;
	private JTextField textField;
	private String num;
	private boolean flag = true ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				new Phone();
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Phone()
	{
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//flagChecked();

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				num = textField.getText() + btn1.getActionCommand();
				textField.setText(num);
			}
		});
		btn1.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		btn1.setBounds(0, 40, 143, 63);
		contentPane.add(btn1);

		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				num = textField.getText() + btn2.getActionCommand();
				textField.setText(num);
			}
		});
		btn2.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		btn2.setBounds(142, 40, 143, 63);
		contentPane.add(btn2);

		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				num = textField.getText() + btn3.getActionCommand();
				textField.setText(num);
			}
		});
		btn3.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		btn3.setBounds(284, 40, 140, 63);
		contentPane.add(btn3);

		textField = new JTextField();
		textField.setBounds(0, 0, 424, 40);
		textField.setBorder(BorderFactory.createEtchedBorder());
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				num = textField.getText() + btn4.getActionCommand();
				textField.setText(num);
			}
		});
		btn4.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		btn4.setBounds(0, 102, 143, 63);
		contentPane.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				num = textField.getText() + btn5.getActionCommand();
				textField.setText(num);
			}
		});
		btn5.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		btn5.setBounds(142, 102, 143, 63);
		contentPane.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				num = textField.getText() + btn6.getActionCommand();
				textField.setText(num);
			}
		});
		btn6.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		btn6.setBounds(284, 102, 140, 63);
		contentPane.add(btn6);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				num = textField.getText() + btn7.getActionCommand();
				textField.setText(num);
			}
		});
		btn7.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		btn7.setBounds(0, 164, 143, 63);
		contentPane.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				num = textField.getText() + btn8.getActionCommand();
				textField.setText(num);
			}
		});
		btn8.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		btn8.setBounds(142, 164, 143, 63);
		contentPane.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				num = textField.getText() + btn9.getActionCommand();
				textField.setText(num);
			}
		});
		btn9.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		btn9.setBounds(284, 164, 140, 63);
		contentPane.add(btn9);

		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText("");
			}
		});
		btnClear.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		btnClear.setBounds(0, 225, 143, 63);
		contentPane.add(btnClear);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				num = textField.getText() + btn0.getActionCommand();
				textField.setText(num);
			}
		});
		btn0.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		btn0.setBounds(142, 225, 143, 63);
		contentPane.add(btn0);

		btnCall = new JButton("CALL");
		btnCall.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				flagChecked();
				flag = false;
			}
		});
		btnCall.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		btnCall.setBounds(284, 225, 140, 63);
		contentPane.add(btnCall);
		
		setTitle("Phone App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 441, 328);
		setVisible(true);
	}
	
	public void flagChecked()
	{
		if(flag == false)
		{
			btnCall.setText("Hang Up");
			textField.setText("");
			btnCall.setText("CALL");
			flag = true;
			
		}
		
		else if(flag == true)
		{
			btnCall.setText("Hang Up");
		}
	}

}
