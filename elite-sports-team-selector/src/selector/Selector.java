package selector;

public class Selector {

	public static void main(String[] args) 
	{
		System.out.println("Accepting member...");
	}

	private String name;
	private String surname;
	private int yearsOfExperience;
	private boolean isAvailable;
	
	public Selector(String name, String surname, int yearsOfExperience, boolean isAvailable) 
	{
		this.name = name;
		this.surname = surname;
		this.yearsOfExperience = yearsOfExperience;
		this.isAvailable = isAvailable;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public String getSurname() 
	{
		return surname;
	}
	
	public int getYearsOfExperience()
	{
		return yearsOfExperience;
	}
	
	public boolean getIsAvailable() 
	{
		return isAvailable;
	}
	
	public void acceptingMember() 
	{
		System.out.println("Accepting member...");
	}

}

