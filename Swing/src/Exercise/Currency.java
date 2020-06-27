package Exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Currency extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6609904070751125917L;
	private JLabel kyatlbl, usdlbl, eurolbl;
	private JTextField kyattf, usdtf, eurotf;
	private float kyat, usd, euro;
	
	public Currency()
	{
		kyatlbl = new JLabel("Kyat");
		usdlbl = new JLabel("USD");
		eurolbl = new JLabel("Euro");
		
		kyattf = new JTextField(kyat + "", 10);
		usdtf = new JTextField(usd + "", 10);
		eurotf = new JTextField(euro + "", 10);
		
		setLayout(new GridLayout(3, 2, 10, 5));
		
		add(kyatlbl);
		add(kyattf);
		kyattf.addActionListener(this);
		add(usdlbl);
		add(usdtf);
		usdtf.addActionListener(this);
		add(eurolbl);
		add(eurotf);
		eurotf.addActionListener(this);
		
		setTitle("Currency Converter");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 140);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Currency();

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		kyat = Float.parseFloat(kyattf.getText());
		usd = Float.parseFloat(usdtf.getText());
		euro = Float.parseFloat(eurotf.getText());
		
		if(e.getSource() == kyattf)
		{
			usd = (float) (kyat * 0.00071);
			euro = (float) (kyat * 0.00065);
			
			usdtf.setText(String.format("%.2f", usd));
			eurotf.setText(String.format("%.2f", euro));
		}
		
		else if(e.getSource() == usdtf)
		{
			kyat = (float) (usd * 1411.35);
			euro = (float) (usd * 0.91);
			
			kyattf.setText(String.format("%.2f", kyat));
			eurotf.setText(String.format("%.2f", euro));
		}
		
		else
		{
			kyat = (float) (euro * 1544.22);
			usd = (float) (euro * 1.09);
			
			kyattf.setText(String.format("%.2f", kyat));
			usdtf.setText(String.format("%.2f", usd));
		}
	}

}
