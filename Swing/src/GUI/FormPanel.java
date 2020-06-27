package GUI;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FormPanel extends JPanel implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel nameLabel;
	private JLabel occupationLabel;
	private JTextField nameField;
	private JTextField occupationField;
	private JButton okbtn;
	private FormListener formListener;
	private JList<AgeCategory> ageList;

	public FormPanel()
	{
		Dimension dim = getPreferredSize();
		dim.width = 250;
		setPreferredSize(dim);

		nameLabel = new JLabel("Name: ");
		occupationLabel = new JLabel("Occupation: ");
		nameField = new JTextField(10);
		occupationField = new JTextField(10);
		ageList = new JList<AgeCategory>();

		okbtn = new JButton("Submit");
		okbtn.addActionListener(this);

		DefaultListModel<AgeCategory> age = new DefaultListModel<>();
		age.add(0, new AgeCategory(0, "under 18"));
		age.add(1, new AgeCategory(1, "18 - 65"));
		age.add(2, new AgeCategory(2, "over 65"));
		ageList.setModel(age);
		
		ageList.setBorder(BorderFactory.createEtchedBorder());
		ageList.setPreferredSize(new Dimension(110, 80));
		ageList.setSelectedIndex(1);

		Border inner = BorderFactory.createTitledBorder("Add Person");
		Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(BorderFactory.createCompoundBorder(outer, inner));

		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		////// First Row/////////
		gc.weightx = 1;
		gc.weighty = 0.1;

		gc.gridx = 0;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(nameLabel, gc);

		gc.gridx = 1;
		gc.gridy = 0;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(nameField, gc);

		////// Second Row/////////
		gc.weightx = 1;
		gc.weighty = 0.1;

		gc.gridx = 0;
		gc.gridy = 1;
		gc.insets = new Insets(0, 0, 0, 5);
		gc.anchor = GridBagConstraints.LINE_END;
		add(occupationLabel, gc);

		gc.gridx = 1;
		gc.gridy = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(occupationField, gc);

		////// Third Row/////////
		gc.weightx = 1;
		gc.weighty = 0.2;

		gc.gridx = 1;
		gc.gridy = 2;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(ageList, gc);

		////// Fourth Row/////////
		gc.weightx = 1;
		gc.weighty = 2.0;

		gc.gridx = 1;
		gc.gridy = 3;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(okbtn, gc);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String name = nameField.getText();
		String occupation = occupationField.getText();
		AgeCategory ageCat = ageList.getSelectedValue();
		
		System.out.println(ageCat.getId());
		
		FormEvent fe = new FormEvent(this, name, occupation, ageCat.getId());

		if (formListener != null)
			formListener.EventOccured(fe);
	}

	public void setFormListener(FormListener listener)
	{
		this.formListener = listener;
	}
}

class AgeCategory
{
	private int id;
	private String text;
	public AgeCategory(int id, String text)
	{
		this.id = id;
		this.text = text;
	}
	
	public String toString()
	{
		return text;
	}
	
	public int getId()
	{
		return id;
	}
}
