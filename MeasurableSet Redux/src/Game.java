
public class Game implements Measurable {
	private int turnOvers;
	private String description;

	public int getMeasure() {
		return turnOvers;
	}
	
	public Game(int turnOvers, String description)
	{
		
	}
	
	public void setTurnOvers(int a)
	{
		turnOvers = a;
	}
	public String toString()
	{
		return turnOvers + " " + description;
	}

}
