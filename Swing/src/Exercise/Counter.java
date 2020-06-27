package Exercise;

import java.awt.*; // Using AWT's layouts
import java.awt.event.*; // Using AWT's event classes and listener interfaces
import javax.swing.*; // Using Swing components and containers

// A Swing application extends javax.swing.JFrame (instead of java.awt.Frame)
public class Counter extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tfCount;

	private JButton btnCount;
	private JButton down;
	private JButton reset;
	private int count = 0;

	public Counter()
	{
		// Get the content-pane of top-level container Jframe
		// Components are added onto content pane
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		cp.add(new JLabel("Counter"));
		tfCount = new JTextField(count + "", 10);
		tfCount.setEditable(false);
		tfCount.setHorizontalAlignment(JTextField.RIGHT);
		cp.add(tfCount);

		btnCount = new JButton("Count");
		btnCount.addActionListener(this);
		cp.add(btnCount);
		
		down = new JButton("Down");
		down.addActionListener(this);
		cp.add(down);
		
		reset = new JButton("Reset");
		reset.addActionListener(this);
		cp.add(reset);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Exit program if Jframe's close-window button clicked
		setSize(500, 100);
		setTitle("Swing Counter");
		setVisible(true); // show it
	}

	public static void main(String[] args)
	{
		// Recommended to run the GUI construction in
		// Event Dispatching thread for thread-safet operations
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				new Counter(); // Let the constructor does the job
			}
		});
	}
	

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btnCount)
        {
        	++count;
            tfCount.setText(count + "");
        }
        
        else if(e.getSource() == down)
        {
        	--count;
        	tfCount.setText(count + "");
        }
        
        else
        {
        	count = 0;
        	tfCount.setText(count + "");
        }
		
	}

}