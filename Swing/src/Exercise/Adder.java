package Exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Adder extends JFrame implements ActionListener
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel int1lbl, int2lbl, sumlbl;
	private JTextField int1tf, int2tf, sumtf;
	private JButton add, clear;
	private int num1, num2, sum = 0;
	
	public Adder()
	{
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(4, 2, 1, 3));
		
		int1lbl = new JLabel("First Integer ");
		int2lbl = new JLabel("Second Integer ");
		sumlbl = new JLabel("Sum ");
		
		int1tf = new JTextField(10);
		int2tf = new JTextField(10);
		sumtf = new JTextField(sum + "", 10);
		
		add = new JButton("Add");
		add.addActionListener(this);
		clear = new JButton("Clear");
		clear.addActionListener(this);
		
		add(int1lbl);
		add(int1tf);
		add(int2lbl);
		add(int2tf);
		add(sumlbl);
		add(sumtf);
		add(add);
		add(clear);
		
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Adder");
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		num1 = Integer.parseInt(int1tf.getText());
		num2 = Integer.parseInt(int2tf.getText());
		sum = num1 + num2;
		
		if(e.getSource() == add)
			sumtf.setText(sum + "");
		else
		{
			int1tf.setText("");
			int2tf.setText("");
			sumtf.setText("");
		}
	}

	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			
			@Override
			public void run()
			{
				new Adder();
			}
		});
	}
}
