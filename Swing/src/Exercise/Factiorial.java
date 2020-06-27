package Exercise;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Factiorial extends JFrame implements ActionListener
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel numLabel;
	private JLabel factLabel;
	private JTextField numField;
	private JTextField factField;
	private int num;
	private int fact = 1;
	
	public Factiorial()
	{
		numLabel = new JLabel("Number");
		numField = new JTextField(10);
		
		factLabel = new JLabel("Factorial");
		factField = new JTextField(fact + "", 10);
		factField.setEditable(false);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.insets = new Insets(0, 0, 0, 5);
		add(numLabel, gc);
		
		gc.gridx = 1;
		gc.gridy = 0;
		gc.insets = new Insets(0, 0, 0, 5);
		add(numField, gc);
		numField.addActionListener(this);
		
		gc.gridx = 2;
		gc.gridy = 0;
		gc.insets = new Insets(0, 0, 0, 5);
		add(factLabel, gc);
		
		gc.gridx = 3;
		gc.gridy = 0;
		gc.insets = new Insets(0, 0, 0, 5);
		add(factField, gc);
		
		setSize(500, 250);
		setTitle("Factorial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		num = Integer.parseInt(numField.getText());
		for(int i = 1; i <= num; i++)
			fact *= i;
		
		factField.setText(fact + "");
		fact = 1;
	}
	
	public static void main(String args[])
	{
		new Factiorial();
	}

}
