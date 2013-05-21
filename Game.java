// Random Movement across a grid
// could eventually be made to take commands of where to go

import javax.swing.JOptionPane;

public class Game
{
  
	public static void main ( String[] args)
	{
		String again;
		String userName = 
				JOptionPane.showInputDialog( "What is your name?" );
		do
		{
			Human human1 	= new Human();
			Monkey monkey1 	= new Monkey();
			Robot robot1 	= new Robot();
			
			
			int runningTime =  ((int) (Math.random() *  10));
			
			String userAnimalChoice = 
				JOptionPane.showInputDialog( "What animal? \n" 
					+ "m = Monkey, "
					+ "h = Human, "
					+ "r = Robot");
					
			
					
					
			switch (userAnimalChoice)
			{
				case "m": 
					JOptionPane.showMessageDialog(null, monkey1.stats());
					JOptionPane.showMessageDialog(null, monkey1.talk(userName) );
					
					monkey1.showGrid();
					for (int seconds = 0; seconds <= 10 ; seconds++ )
					{
						if (seconds == runningTime)
						{
							
							monkey1.run(seconds);
						}
						else
						{
							monkey1.walk(seconds);
						}
						monkey1.showGrid();
					}
					monkey1.GameHistoryArray();
					break;
				case "h": 
					JOptionPane.showMessageDialog(null, human1.stats());
					JOptionPane.showMessageDialog(null, human1.talk(userName) );
					
					human1.showGrid();
					for (int seconds = 0; seconds <= 10 ; seconds++ )
					{
						
						if (seconds == runningTime)
						{
							human1.run(seconds);
						}
						else
						{
							human1.walk(seconds);
						}
						human1.showGrid();
					}
					human1.GameHistoryArray();
					break;
				case "r":
					JOptionPane.showMessageDialog(null, robot1.stats());
					JOptionPane.showMessageDialog(null, robot1.talk(userName) );
					
					robot1.showGrid();
					for (int seconds = 0; seconds <= 10 ; seconds++ )
					{
						if (seconds == runningTime)
						{
							
							robot1.run(seconds);
						}
						else
						{
							robot1.walk(seconds);
						}
						robot1.showGrid();
					}
					human1.GameHistoryArray();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Do you not want to play?");
			}
			
			again = 
				JOptionPane.showInputDialog( "Do you want to play again? (Y/N)" );
		}
		while(again.equalsIgnoreCase("Y"));
	}
}
