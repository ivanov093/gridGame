import javax.swing.JOptionPane;

public class Biped extends Animal
{
  private  int[] xHistory = new int[10];
	private  int[] yHistory = new int[10];
	private int xCoordinate;
	private int yCoordinate;
	private int typeOfBipedGlobal;
	private String typeOfBipedString = "";

	public Biped (int typeOfBiped)
	{
		super (typeOfBiped);
		typeOfBipedGlobal = typeOfBiped;
		xCoordinate = 0;
		yCoordinate = 0;
	}

	// statictical information of the player object
	public String stats()
	{
		return "My name is: " + name + "\n" +
			"Gender: " + gender + "\n" +
			"Speed: " + speed + " units per second\n" +
			"Weight: " + weight + "lbs\n" +
			"Running Distance: " + runningDistance + " units\n";
	}


	// location on the game grid
	public void location (int xChange, int yChange)
	{
		xCoordinate = xCoordinate + xChange;
		if (xCoordinate < 0)
		{
			xCoordinate = 0;
		}
		else if (xCoordinate > 20)
		{
			xCoordinate = 20;
		}
		
		yCoordinate = yCoordinate + yChange;
		if (yCoordinate < 0)
		{
			yCoordinate = 0;
		}
		else if (yCoordinate > 20)
		{
			yCoordinate = 20;
		}
	}
	
	// walking
	// uses the value of speed in the x and y directions
	// and not the hypotenuse, as it should
	public void walk(int seconds)
	{
		int northOrSouth = ((int) (Math.random() *  10));
		int xChange = speed;
		int eastOrWEst = ((int) (Math.random() *  10));
		int yChange = speed;
		if (northOrSouth < 2)
		{
			yChange = -yChange;
			yHistory[seconds] = yChange;
		}
		if (eastOrWEst < 3)
		{
			xChange = -xChange;
			xHistory[seconds] = xChange;
		}
		location (xChange, yChange);
	}
	
	public void run(int seconds)
	{
		int xChange1 = speed;
		int yChange1 = speed;
		do
		{
			walk(seconds);
			xChange1 += speed;
		}
		while (xChange1 < runningDistance);
	}
	
	
	public void showGrid()
	{
		JOptionPane.showMessageDialog(null, 
			wholeGrid (xCoordinate, yCoordinate));
	}
	
	public void typeOfBipedString()
	{
		switch (typeOfBipedGlobal)
		{
			case 0:
				typeOfBipedString = "Monkey"; break;
			case 1:
				typeOfBipedString = "Human"; break;
			case 2:
				typeOfBipedString = "Robot"; break;
		}
	}
	
	
	
	public void GameHistoryArray()
	{
		typeOfBipedString();
		int x = 0;
		while (x < 10)
		{
			JOptionPane.showMessageDialog( null, 
				"\n At " + x + " seconds " + typeOfBipedString + 
				"moved: x:" + xHistory[x] + " and y:" + yHistory[x] + "\n");
			++x;
		}
		
	}
}
