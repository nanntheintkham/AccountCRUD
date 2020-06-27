package Exercise;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AccumlatedSum extends JFrame implements ActionListener
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel intLabel;
	private JLabel sumLabel;
	private JTextField intField;
	private JTextField sumField;
	private int sum = 0;
	
	public AccumlatedSum()
	{
		intLabel = new JLabel("Enter an Integer");
		intField = new JTextField(10);
		sumLabel = new JLabel("Accumulated Sum: ");
		sumField = new JTextField(sum + "" , 10);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.weightx = 1;
		gc.weighty = 0.5;
		gc.gridx = 0;
		gc.gridy = 0;
		add(intLabel, gc);
		
		gc.gridx = 1;
		gc.gridy = 0;
		add(intField, gc);
		intField.addActionListener(this);
		
		gc.gridx = 0;
		gc.gridy = 1;
		add(sumLabel, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		add(sumField, gc);
		
		setSize(400, 200);
		setTitle("Accumalated Sum Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		int num = Integer.parseInt(intField.getText());
		
		sum += num;
		sumField.setText(sum + "");
	}
	
	public static void main(String args[])
	{
		new AccumlatedSum();
	}
}
