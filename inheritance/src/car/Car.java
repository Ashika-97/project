package car;

public class Car {

	int yearOfMake;
	String carType;
	long engineNumber;
	String inputString="car Type";

public void setYearOfMake(int yearOfMake) 
{
	this.yearOfMake = yearOfMake;
}
	
public int getYearOfMake() 
{
	return yearOfMake;
}

public String getCarType()
{
	return carType;
}
public void setCarType(String carType)
{
	this.carType = carType;
}
public long getEngineNumber()
{
	return engineNumber;
}
public void setEngineNumber(long engineNumber)
{
	this.engineNumber = engineNumber;
}
public void maintenance()
{
System.out.println("car is under maintenance");
}
 public Car()
{
	 
}

public  Car(String input)
{	
	inputString=input;
}
public String toString()
{
return inputString;

}
	
	
	
}