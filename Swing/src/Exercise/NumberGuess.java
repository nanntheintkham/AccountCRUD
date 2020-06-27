package Exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class NumberGuess extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel numlbl, guesslbl, result;
	private JTextField guesstf;
	private JPasswordField numtf;
	private JButton generate;
	private int num, guess;
	
	public NumberGuess()
	{
		numlbl = new JLabel("The Number is");
		guesslbl = new JLabel("Enter your guess");
		numtf = new JPasswordField(10);
		guesstf = new JTextField(10);
		generate = new JButton("Generate");
		result = new JLabel();
		
		Container cp = getContentPane();
		
		cp.setLayout(new GridLayout(2, 3, 5, 3));
		
		cp.add(numlbl);
		cp.add(numtf);
		cp.add(generate);
		generate.addActionListener(this);
		
		
		cp.add(guesslbl);
		cp.add(guesstf);
		guesstf.addActionListener(this);
		cp.add(result);
		
		
		
		setTitle("Guess Number");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 120);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == generate)
		{
			Random ran = new Random();
			num = ran.nextInt(100);
			numtf.setText(num + "");
		}
		
		if(e.getSource() == guesstf)
		{
			guess = Integer.parseInt(guesstf.getText());
			if(guess < num)
				result.setText("Try Higher");
			else if(guess > num)
				result.setText("Try Lower");
			else
				result.setText("You Got it!");
		}
	}
	
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			
			@Override
			public void run()
			{
				new NumberGuess();
				
			}
		});
		
	}

}
