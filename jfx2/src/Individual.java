
public class Individual {

	private String firstName;
	private String lastName;
	private int zipCode;
	public Individual(String f, String l, int z)
	{
		firstName = f;
		lastName = l;
		zipCode = z;
	}
	public String toString()
	{
		return firstName + "\t" + lastName + "\t" + zipCode;
	}
}

