package Exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temperature extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel celilbl, fahrelbl;
	private JTextField celitf, fahretf;
	private float celi, fahre;
	
	public Temperature()
	{
		celilbl = new JLabel("Celsius:");
		fahrelbl = new JLabel("Fahrenheit:");
		
		celitf = new JTextField(celi + "", 10);
		celitf.addActionListener(this);
		fahretf = new JTextField(fahre + "", 10);
		fahretf.addActionListener(this);
		
		setLayout(new GridLayout(2, 2, 10, 5));
		
		add(celilbl);
		add(celitf);
		add(fahrelbl);
		add(fahretf);
		
		setTitle("Temperature Converter");
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Temperature();

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		celi = Float.parseFloat(celitf.getText());
		fahre = Float.parseFloat(fahretf.getText());
		
		if(e.getSource() == celitf)
		{
			fahre = (float) ((celi * 1.8) + 32);
			fahretf.setText(String.format("%.1f", fahre));
		}
		
		else 
		{
			celi = (float) ((fahre - 32) / 1.8);
			celitf.setText(String.format("%.1f", celi));
		}
	}

}
