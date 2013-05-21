public class Grid
{
  private int typeOfBipedGlobal;
	public Grid (int typeOfBiped)
	{
		typeOfBipedGlobal = typeOfBiped;
	}
	
	public String oneRow (boolean yCoordinateBool, int xCoordinate)
	{
		String oneRowString = "";
		oneRowString += "|";
		for (int x = 0; x <= 20; ++x )
		{
			if ( yCoordinateBool )
			{
				if ( xCoordinate == x )
				{
					switch (typeOfBipedGlobal)
					{
						case 0: oneRowString += "*$*"; break;
						case 1: oneRowString += "*@*"; break;
						case 2: oneRowString += "*&*"; break;
					}
				}
				else
				{
					oneRowString += "   ";
				}
					
			}
			else
			{
				oneRowString += "   ";
			}
			
		}
		oneRowString += "|";
		return oneRowString + "\n";
	}
	
	public String wholeGrid (int xCoordinate, int yCoordinate)
	{
		String wholeGridString = "";
		for (int y = 20; y >= 0; --y )
		{
			boolean yCoordinateBool = (yCoordinate == y);
			
			wholeGridString += oneRow (yCoordinateBool, xCoordinate);
		}
		return wholeGridString;
	}
}
