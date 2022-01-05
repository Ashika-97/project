package enumPack;

 enum EnumExample {
	VIOLET(1),INDIGO(2),BLUE(3),GREEN(4),YELLOW(5),ORANGE(6),RED(7);
	
private	 int number;
	EnumExample()
	{
		
	}
EnumExample(int number) 
	{
	this.number=number;
	}
public int  printNumber()
{
	return this.number;
}
}

public class EnumClass{
	public static void main(String[] args)
	{
		for(EnumExample example:EnumExample.values())
		{
			System.out.println("the color code" + example +"is" + example.printNumber());
		}
	 }
}
	
		
/*	switch(example)
	{
	
	try {
		case VIOLET:
			System.out.println("THE COLOR CODE OF VIOLET IS" + example.printNumber());
	        break;
		case INDIGO:
			System.out.println("THE COLOR CODE OF INDIGO IS" + example.printNumber());
	        break;
		case BLUE:
			System.out.println("THE COLOR CODE OF BLUE IS" + example.printNumber());
	        break;
		case GREEN:
			System.out.println("THE COLOR CODE OF GREEN IS" + example.printNumber());
	        break;
		case YELLOW:
			System.out.println("THE COLOR CODE OF YELLOW IS" + example.printNumber());
	        break;
		case ORANGE:
			System.out.println("THE COLOR CODE OF ORANGE IS" + example.printNumber());
	        break;
		case RED:
			System.out.println("THE COLOR CODE OF RED IS" + example.printNumber());
	        break;
		default:
			break;
	}
		
	catch(Exception exception)
	{
		System.out.println("error occured");
	}
}*/