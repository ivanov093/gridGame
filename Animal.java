public class Animal extends Grid
{
  public String name;				//
	public String gender;			//
	public int speed;				//
	public int age;					//
	public int weight;				//
	public int acceleration;		
	public int runningDistance;		//
	public int bodyLiftRatio;		
	
	
	
	public Animal (int typeOfBiped)
	{
		super(typeOfBiped);
		int genderRandNum = ((int) (Math.random() *  10));
		int nameRandNum = ((int) (Math.random() *  3));
		if (typeOfBiped == 2)
		{
			gender = "None";
			switch (nameRandNum)
			{
				case 0: name = "R2D2";		break;
				case 1: name = "3CPO";		break;
				case 2: name = "Bender";	break;
				default:
					name = "robotX";
			}
		}
		else if ((genderRandNum % 2) == 0)
		{
			gender = "male";
			switch (nameRandNum)
			{
				case 0: name = "Robert";	break;
				case 1: name = "Bob";		break;
				case 2: name = "Steve";		break;
				default:
					name = "George";
			}
		}
		else
		{
			gender = "female";
			switch (nameRandNum)
			{
				case 0: name = "Jasmin";	break;
				case 1: name = "Kelly";		break;
				case 2: name = "Josie";		break;
				default:
					name = "Alexis";
			}
		}
		
		switch (typeOfBiped)
		{
			case 0: weight = (10 + ((int) (Math.random() *  15)));
				break;
			case 1: 
				if (gender == "male"){
					weight = (120 + ((int) (Math.random() *  40)));
				}
				else{
					weight = (100 + ((int) (Math.random() *  35)));
				}
				break;
			case 2: weight = (150 + ((int) (Math.random() *  35)));
				break;
		}
		
		age = (20 + ((int) (Math.random() *  10)));
		
		switch (typeOfBiped)
		{
			case 0: speed = 3 ;break;
			case 1: speed = 3 ;break;
			case 2: speed = 4;break;
		}
		
		switch (typeOfBiped)
		{
			case 0: runningDistance = 10;	break;
			case 1: runningDistance = 8;	break;
			case 2: runningDistance = 15;	break;
		}
	}
	
	
	
}
