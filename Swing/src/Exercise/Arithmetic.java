package Exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Arithmetic extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel num1lbl, num2lbl, resultlbl;
	private JTextField num1tf, num2tf, resulttf;
	private JButton plus, minus, multiply, divide, mod, clear;
	private int num1, num2, result = 0;
	
	public Arithmetic()
	{
		num1lbl = new JLabel("First Number");
		num2lbl = new JLabel("Second Number");
		resultlbl = new JLabel("Result");
		
		num1tf = new JTextField(10);
		num2tf = new JTextField(10);
		resulttf = new JTextField(result + "", 10);
		resulttf.setEditable(false);
		
		plus = new JButton("+");
		minus = new JButton("-");
		multiply = new JButton("*");
		divide = new JButton("/");
		mod = new JButton("%");
		clear = new JButton("CLEAR");
		
		setLayout(new GridLayout(6, 2, 10, 6));
		
		///1st Row///
		add(num1lbl);
		add(num1tf);
		
		///2nd Row///
		add(num2lbl);
		add(num2tf);
		
		///3rd Row///
		add(resultlbl);
		add(resulttf);
		
		///4th Row///
		add(plus);
		plus.addActionListener(this);
		add(minus);
		minus.addActionListener(this);
		
		///5th Row///
		add(multiply);
		multiply.addActionListener(this);
		add(divide);
		divide.addActionListener(this);
		
		///6th Row///
		add(mod);
		mod.addActionListener(this);
		add(clear);
		clear.addActionListener(this);
		
		setTitle("Arithmetic Calculator");
		setSize(300, 280);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Arithmetic();

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		num1 = Integer.parseInt(num1tf.getText());
		num2 = Integer.parseInt(num2tf.getText());
		if(e.getSource() == plus)
		{
			result = num1 + num2;
			resulttf.setText(result + "");
		}
		
		else if(e.getSource() == minus)
		{
			result = num1 - num2;
			resulttf.setText(result + "");
		}
		
		else if(e.getSource() == multiply)
		{
			result = num1 * num2;
			resulttf.setText(result + "");
		}
		
		else if(e.getSource() == divide)
		{
			result = num1 / num2;
			resulttf.setText(result + "");
		}
		
		else if(e.getSource() == mod)
		{
			result = num1 % num2;
			resulttf.setText(result + "");
		}
		
		else
		{
			num1tf.setText("");
			num2tf.setText("");
			resulttf.setText("");
		}
	}

}
