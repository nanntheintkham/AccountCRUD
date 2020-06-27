package Exercise;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Countdown extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel countLabel;
	private JTextField countField;
	private JButton btn;
	private int count = 88;
	
	public Countdown()
	{
		
		countLabel = new JLabel("Count");
		countField = new JTextField(count + "", 10);
		btn = new JButton("Countdown");
		
		setLayout(new FlowLayout());
		add(countLabel);
		add(countField);
		
		add(btn);
		btn.addActionListener(this);
		
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		count--;
		countField.setText(count + "");
		
	}
	
	public static void main(String args[])
	{
		new Countdown();
	}

}
