
public class Player {
	private String name;
	private double average;

	public Player(String argName, double argAverage)
	{
		name = argName;
		average = argAverage;
	}
	
	public String toString()
	{
		return "{" + name + ": " + average + "}";
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getAverage()
	{
		return average;
	}
}
