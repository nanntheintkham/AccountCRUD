package Exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField input;
	private JPanel pane;
	private JButton one, two, three, four, five, six, seven, eight, nine, zero;
	private JButton plus, minus, multiply, divide, equal, clear;
	private int result = 0;
	private String number = "";
	private char current = ' ';
	private char previous = ' ';
	private int num1 = 0, num2 = 0;
	//private int oper;
	
	public Calculator()
	{
		Container cp = getContentPane();
		setLayout(new BorderLayout());
		
		input = new JTextField(result + "");
		input.setPreferredSize(new Dimension(290, 30));
		input.setHorizontalAlignment(JTextField.RIGHT);
		cp.add(input, BorderLayout.NORTH);
		
		pane = new JPanel();
		pane.setLayout(new GridLayout(4, 4, 3, 2));
		cp.add(pane, BorderLayout.CENTER);
		
		seven = new JButton("7");
		seven.addActionListener(new numListener());
		pane.add(seven);
		
		eight = new JButton("8");
		eight.addActionListener(new numListener());
		pane.add(eight);
		
		nine = new JButton("9");
		nine.addActionListener(new numListener());
		pane.add(nine);
		
		plus = new JButton("+");
		plus.addActionListener(new operListener());
		pane.add(plus);
		
		four = new JButton("4");
		four.addActionListener(new numListener());
		pane.add(four);
		
		five = new JButton("5");
		five.addActionListener(new numListener());
		pane.add(five);
		
		six = new JButton("6");
		six.addActionListener(new numListener());
		pane.add(six);
		
		minus = new JButton("-");
		minus.addActionListener(new operListener());
		pane.add(minus);
		
		one = new JButton("1");
		one.addActionListener(new numListener());
		pane.add(one);
		
		two = new JButton("2");
		two.addActionListener(new numListener());
		pane.add(two);
		
		three = new JButton("3");
		three.addActionListener(new numListener());
		pane.add(three);
		
		multiply = new JButton("*");
		multiply.addActionListener(new operListener());
		pane.add(multiply);
		
		clear = new JButton("C");
		clear.addActionListener(new operListener());
		pane.add(clear);
		
		zero = new JButton("0");
		zero.addActionListener(new numListener());
		pane.add(zero);
		
		equal = new JButton("=");
		equal.addActionListener(new operListener());
		pane.add(equal);
		
		divide = new JButton("/");
		divide.addActionListener(new operListener());
		pane.add(divide);
		
		setTitle("Calculator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			
			@Override
			public void run()
			{
				new Calculator();
				
			}
		});

	}

	class numListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			number += e.getActionCommand();
			if(current == ' ')
				input.setText(number);
			
			else
			{
				int n = Integer.parseInt(number);
				num2 = n % 10;
				input.setText(num2 + "");
			}
			
		}
		
	}
	
	class operListener implements ActionListener
	{
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			previous = current;
			current = e.getActionCommand().charAt(0);
			
			if(e.getSource() == plus || e.getSource() == minus || e.getSource() == multiply || e.getSource() == divide)
			{
				num1 = Integer.parseInt(number);
				input.setText("");
			}
			
			else if(e.getSource() == equal)
			{
				
				
				if(previous == '+')
					result = num1 + num2;
				
				else if(previous == '-')
					result = num1 - num2;
				
				else if(previous == '*')
					result = num1 * num2;
				
				else
					result = num1 / num2;
				
				input.setText("" + result);
					
			}
			
			else 
				input.setText("");

		}
	}
	
		
}



