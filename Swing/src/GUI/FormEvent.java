package GUI;

import java.util.EventObject;

public class FormEvent extends EventObject
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int AgeCategory;
	private String name;
	private String occupation;

	public FormEvent(Object source)
	{
		super(source);
	}
	
	public FormEvent(Object source, String name, String occupation, int ageCat)
	{
		super(source);
		this.name = name;
		this.occupation = occupation;
		ageCat = AgeCategory;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getOccupation()
	{
		return occupation;
	}

	public void setOccupation(String occupation)
	{
		this.occupation = occupation;
	}
	
	public int getAgeCategory()
	{
		return AgeCategory;
	}
}
