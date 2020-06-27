package Exercise;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator1 extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	private double first, second, result;
	private String operator;

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
					Calculator1 frame = new Calculator1();
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
	public Calculator1()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 307, 239);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		textField = new JTextField();
		textField.setName("distf");
		textField.setPreferredSize(new Dimension(7, 33));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(11, 10));
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setLayout(new GridLayout(4, 4, 5, 3));
		contentPane.add(panel, BorderLayout.CENTER);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = textField.getText() + btn7.getText();
				textField.setText(input);
			}
		});
		btn7.setName("btn7");
		btn7.setPreferredSize(new Dimension(89, 35));
		panel.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = textField.getText() + btn8.getText();
				textField.setText(input);
			}
		});
		btn8.setName("btn8");
		btn8.setPreferredSize(new Dimension(89, 35));
		panel.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = textField.getText() + btn9.getText();
				textField.setText(input);
			}
		});
		btn9.setName("btn9");
		btn9.setPreferredSize(new Dimension(89, 35));
		panel.add(btn9);

		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "+";
			}
		});
		plus.setName("plus");
		plus.setPreferredSize(new Dimension(89, 35));
		panel.add(plus);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = textField.getText() + btn4.getText();
				textField.setText(input);
			}
		});
		btn4.setName("btn4");
		btn4.setPreferredSize(new Dimension(89, 35));
		panel.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = textField.getText() + btn5.getText();
				textField.setText(input);
			}
		});
		btn5.setName("btn5");
		btn5.setPreferredSize(new Dimension(89, 35));
		panel.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = textField.getText() + btn6.getText();
				textField.setText(input);
			}
		});
		btn6.setName("btn6");
		btn6.setPreferredSize(new Dimension(89, 35));
		panel.add(btn6);

		JButton subtract = new JButton("-");
		subtract.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "-";
			}
		});
		subtract.setPreferredSize(new Dimension(89, 35));
		panel.add(subtract);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = textField.getText() + btn1.getText();
				textField.setText(input);
			}
		});
		btn1.setPreferredSize(new Dimension(89, 35));
		panel.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = textField.getText() + btn2.getText();
				textField.setText(input);
			}
		});
		btn2.setName("btn2");
		btn2.setPreferredSize(new Dimension(89, 35));
		panel.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = textField.getText() + btn3.getText();
				textField.setText(input);
			}
		});
		btn3.setName("btn3");
		btn3.setPreferredSize(new Dimension(89, 35));
		panel.add(btn3);

		JButton multiply = new JButton("*");
		multiply.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "*";
			}
		});
		multiply.setName("multiply");
		multiply.setPreferredSize(new Dimension(89, 35));
		panel.add(multiply);

		JButton btnc = new JButton("C");
		btnc.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText("");
			}
		});
		btnc.setName("btnc");
		btnc.setPreferredSize(new Dimension(89, 35));
		panel.add(btnc);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = textField.getText() + btn0.getText();
				textField.setText(input);
			}
		});
		btn0.setName("btn0");
		btn0.setPreferredSize(new Dimension(89, 35));
		panel.add(btn0);

		JButton btneq = new JButton("=");
		btneq.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				second = Double.parseDouble(textField.getText());
				if(operator == "+")
				{
					result = first + second;
					textField.setText(String.format("%.2f", result));
				}
				
				else if(operator == "-")
				{
					result = first - second;
					textField.setText(String.format("%.2f", result));
				}
				
				else if(operator == "*")
				{
					result = first * second;
					textField.setText(String.format("%.2f", result));
				}
				
				else
				{
					result = first / second;
					textField.setText(String.format("%.2f", result));
				}
			}
		});
		btneq.setName("btneq");
		btneq.setPreferredSize(new Dimension(89, 35));
		panel.add(btneq);

		JButton divide = new JButton("/");
		divide.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "/";
			}
		});
		divide.setName("divide");
		panel.add(divide);
	}

}
