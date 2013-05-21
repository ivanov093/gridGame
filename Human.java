import javax.swing.JOptionPane;

public class Human extends Biped
{
  
	
	
	public Human()
	{
		super (1);
	}
	
	private int dialogeCount;
	private String dialoge;
	
	// could go in Biped...
	public String talk(String userName)
	{
		dialogeCount = ((int) (Math.random() *  5));
		switch (dialogeCount)
		{
			case 0: 
				dialoge = "Hello, " + userName; 
				break;
			case 1:
				dialoge = "My name is " + name; 
				break;
			case 2:
				dialoge = "This isn't a very good game."; 
				break;
			
			default:
				dialoge = "I'm a Human";
				
		}
		
		return dialoge;
	}
	
	public void walk (int seconds)
	{
		super.walk( seconds );
	}
	
	public void run (int seconds)
	{
		super.run( seconds );
	}
	
	public String stats()
	{
		return super.stats();
	}
	
	public void showGrid()
	{
		super.showGrid();
	}
	
	public void GameHistoryArray()
	{
		super.GameHistoryArray();
	}
}
